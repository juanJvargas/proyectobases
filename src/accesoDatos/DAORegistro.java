/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Cama;
import logica.Registro;

/**
 *
 * @author jdtorres
 */
public class DAORegistro {

    AccesoBD acceso;

    public DAORegistro() {
        acceso = new AccesoBD();
    }

    public boolean insertarRegistro(Registro r) {
        String sql_select;
        sql_select = "INSERT INTO registro ("
                + "numero_registro, "
                + "identificacion_paciente, "
                + "identificacion_empleado, "
                + "fecha_consulta, "
                + "observaciones "
                + "VALUES ('" + r.getNumero_registro() + "',"
                + "'" + r.getIdentificacion_paciente() + "', "
                + "'" + r.getIdentificacion_empleado() + "', "
                + "'" + r.getFecha() + "', "
                + "'" + r.getObservaciones() + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("insertando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    } //End insertar

    public ArrayList<Registro> consultarRegistrosP(int identificacion){
        ArrayList<Registro> re = new ArrayList<Registro>();
        
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM registro WHERE identificacion_paciente = '"+ identificacion + "'";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Registro aux = new Registro();
                aux.setNumero_registro(Integer.valueOf(tabla.getString(1)));
                aux.setIdentificacion_paciente(Integer.valueOf(tabla.getString(2)));
                aux.setIdentificacion_empleado(Integer.valueOf(tabla.getString(3)));
                aux.setFecha(tabla.getString(4));
                aux.setObservaciones(tabla.getString(5));
                re.add(aux);
            }
            return re;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Registro> consultarRegistrosM(int identificacion){
        ArrayList<Registro> re = new ArrayList<Registro>();
        
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM registro WHERE identificacion_empleado = '"+ identificacion + "'";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Registro aux = new Registro();
                aux.setNumero_registro(Integer.valueOf(tabla.getString(1)));
                aux.setIdentificacion_paciente(Integer.valueOf(tabla.getString(2)));
                aux.setIdentificacion_empleado(Integer.valueOf(tabla.getString(3)));
                aux.setFecha(tabla.getString(4));
                aux.setObservaciones(tabla.getString(5));
                re.add(aux);
            }
            return re;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Registro> consultarRegistrosR(String fecha1, String fecha2){
        ArrayList<Registro> re = new ArrayList<Registro>();
        
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM registro WHERE fecha_consulta BETWEEN '"+fecha1+"' AND '"+fecha2+"'";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Registro aux = new Registro();
                aux.setNumero_registro(Integer.valueOf(tabla.getString(1)));
                aux.setIdentificacion_paciente(Integer.valueOf(tabla.getString(2)));
                aux.setIdentificacion_empleado(Integer.valueOf(tabla.getString(3)));
                aux.setFecha(tabla.getString(4));
                aux.setObservaciones(tabla.getString(5));
                re.add(aux);
            }
            return re;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
