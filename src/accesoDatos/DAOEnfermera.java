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
import logica.Enfermera;

/**
 *
 * @author juan
 */
public class DAOEnfermera {
    AccesoBD acceso;

    public DAOEnfermera() {
        acceso = new AccesoBD();
    }

    public boolean insertEnfermera(Enfermera enfermera) {
        String sql_select;

        sql_select = "INSERT INTO enfermera"
                + " VALUES('" + String.valueOf(enfermera.getIdentificacion_empleado())
                + "','" + String.valueOf(enfermera.getAnos_experiencia())
                + "','" + enfermera.getCodigo_habilidad()+ "')";
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

    public ArrayList<String> todosEnfermera() {

        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT identificacion_empleado, nombre FROM  enfermera NATURAL JOIN empleado  WHERE identificacion_empleado in (SELECT identificacion_empleado FORM empleado WHERE estado='activa')";
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


    public Enfermera consultarEnfermera(int codigo) {
        Enfermera enfermera = new Enfermera();
        String sql_select;
        sql_select = "SELECT * FROM enfermera WHERE identificacion_empleado='" + codigo + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la empleado en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                enfermera.setIdentificacion_empleado(Integer.valueOf(tabla.getString(1)));
                enfermera.setAnos_experiencia(Integer.parseInt(tabla.getString(2)));
                enfermera.setCodigo_habilidad(tabla.getString(3));
               

                System.out.println("ok");
            }

            return enfermera;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean updateenfermera(Enfermera enfermera) {
        String sql_select;
        sql_select = "UPDATE empleado "
                + "SET "
                + "identificaion_empleado='" + enfermera.getIdentificacion_empleado() + "', "
                + "numero_licencia='" + enfermera.getAnos_experiencia()+ "', "
                + "codigo_habilidad='" + enfermera.getCodigo_habilidad() + "' "
                + "' WHERE idenitfiacion_empleado='" + enfermera.getIdentificacion_empleado() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando empleado  en  bd");
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

    public ArrayList<String> habilidadesesEnfermera(int identificacion) {

        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT codigo_habilidad FROM  enfermera WHERE identificacion_empleado='" + identificacion + "'";
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

    public ArrayList<String> habilidades() {
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT * FROM habilidad ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la habilidades en la bd");
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
    
    public ArrayList<String> filtrarEnfermeraPorHabilidad(String habilidad){
        
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT identificacion_empleado FROM enfermera  WHERE codigo_habilidad LIKE '%"+habilidad+"%'";
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