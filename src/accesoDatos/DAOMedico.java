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
import logica.Medico;

/**
 *
 * @author juand
 */
public class DAOMedico {

    AccesoBD acceso;

    public DAOMedico() {
        acceso = new AccesoBD();
    }

    public boolean insertMEdico(Medico medico) {
        String sql_select;

        sql_select = "INSERT INTO medico"
                + " VALUES('" + String.valueOf(medico.getIdentificacion_empleado())
                + "','" + String.valueOf(medico.getNumero_licencia())
                + "','" + medico.getCodigo_especialidad()
                + "','" + medico.getUniversidad() + "')";
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
    }
    

    public ArrayList<String> todosMedico() {

        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT identificacion_empleado, nombre FROM  medico NATURAL JOIN empleado  WHERE identificacion_empleado in (SELECT identificacion_empleado FROM empleado WHERE estado='activa')";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
                ve.add((tabla.getString(2)));

            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<String> todosMedicosLibresEnFechaHora(java.sql.Date fecha, int hora) {
        
        String sql = "SELECT * FROM medico NATURAL JOIN "
                + "(SELECT identificacion_empleado FROM medico "
                + "EXCEPT "
                + "SELECT identificacion_empleado FROM cita WHERE fecha = '"+fecha.toString()+"' and hora = '"+hora+"') T";

        return todosMedicoSQL(sql);
    }

    public ArrayList<String> todosMedicoSQL(String sql_select) {

        ArrayList<String> ve = new ArrayList<String>();

        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
                //ve.add((tabla.getString(2)));
            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Medico consultarMedico(int codigo) {
        Medico medico = new Medico();
        String sql_select;
        sql_select = "SELECT * FROM medico WHERE identificacion_empleado='" + codigo + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la empleado en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                medico.setIdentificacion_empleado(Integer.valueOf(tabla.getString(1)));
                medico.setNumero_licencia(Integer.parseInt(tabla.getString(2)));
                medico.setCodigo_especialidad(tabla.getString(3));
                medico.setUniversidad(tabla.getString(4));

                System.out.println("ok");
            }

            return medico;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean updatemedico(Medico medico) {
        String sql_select;
        sql_select = "UPDATE medico "
                + "SET "
                + "identificacion_empleado='" + medico.getIdentificacion_empleado() + "', "
                + "numero_licencia='" + medico.getNumero_licencia() + "', "
                + "codigo_especialidad='" + medico.getCodigo_especialidad() + "', "
                + "universidad='" + medico.getUniversidad()
                + "' WHERE identificacion_empleado='" + medico.getIdentificacion_empleado() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando medico  en  bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public ArrayList<String> especialidadesesMedico(int identificacion) {

        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT codigo_especialidad FROM  medico WHERE identificacion_empleado='" + identificacion + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<String> especialidades() {
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT * FROM especialidad ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la especialidades en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
                ve.add((tabla.getString(2)));
            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<String> filtrarMedicoPorEspecialidad(String especialidad){
        
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT identificacion_empleado FROM medico  WHERE codigo_especialidad LIKE '%"+especialidad+"%'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
