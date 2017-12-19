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
import logica.*;
/**
 *
 * @author jdtorres
 */
public class DAOFormula {
    AccesoBD acceso;
    
    public DAOFormula() {
        acceso = new AccesoBD();
    }
    
    public boolean insertarFormula(Formula f){
        
        String sql_select = "INSERT INTO formula (identificacion_empleado, identificacion_paciente, fecha) VALUES ("
                +String.valueOf(f.getIdentificacionEmpleado())+", "
                +String.valueOf(f.getIdentificacionPaciente())+", now())";
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
    }//End insertar
    
    public Formula consultarFormula(String idFormula){
        try {
            Formula fe = new Formula();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM formula WHERE codigo_formula = " + idFormula;
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                fe.setCodigoFormula(Integer.valueOf(tabla.getString(1)));
                fe.setIdentificacionEmpleado(Integer.valueOf(tabla.getString(2)));
                fe.setIdentificacionPaciente(Integer.valueOf(tabla.getString(3)));
                fe.setFecha(tabla.getString(4));
                System.out.println("ok");
            }
            return fe;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public ArrayList<Formula> consultarFormulas(){
        try {
            ArrayList<Formula> formula = new ArrayList<Formula>();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM formula";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Formula fe = new Formula();
                fe.setCodigoFormula(Integer.valueOf(tabla.getString(1)));
                fe.setIdentificacionEmpleado(Integer.valueOf(tabla.getString(2)));
                fe.setIdentificacionPaciente(Integer.valueOf(tabla.getString(3)));
                fe.setFecha(tabla.getString(4));
                formula.add(fe);
                System.out.println("ok");
            }
            return formula;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public ArrayList<Formula> consultarFormulasP(String idPaciente){
        try {
            ArrayList<Formula> formula = new ArrayList<Formula>();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM formula WHERE identificacion_paciente = "+idPaciente;
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Formula fe = new Formula();
                fe.setCodigoFormula(Integer.valueOf(tabla.getString(1)));
                fe.setIdentificacionEmpleado(Integer.valueOf(tabla.getString(2)));
                fe.setIdentificacionPaciente(Integer.valueOf(tabla.getString(3)));
                fe.setFecha(tabla.getString(4));
                formula.add(fe);
                System.out.println("ok");
            }
            return formula;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public String consultarUF(){
        String resultado = "";
        try {
            
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM formula";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                resultado = tabla.getString(1);
                System.out.println("ok");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
}
