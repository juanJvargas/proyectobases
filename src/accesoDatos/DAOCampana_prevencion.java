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
import logica.CampanaPrevencion;

/**
 *
 * @author juan
 */
public class DAOCampana_prevencion {

    AccesoBD acceso;

    public DAOCampana_prevencion() {
        acceso = new AccesoBD();
    }

    public boolean insertarCampanaPrevencion(CampanaPrevencion a) {
        String sql_select;
        sql_select = "INSERT INTO campana_prevencion "
                + "VALUES ("
                + "'" + String.valueOf(a.getCodigo_campana()) + "',"
                + "'" + a.getNombre() + "',"
                + "'" + a.getObjetivo() + "',"
                + "'" + a.getFecha() + "',"
                + "'" + String.valueOf(a.getIdentificacion_empleado()) + "')";
        System.out.println(sql_select);
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("insertando campaña en la bd");
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

    public CampanaPrevencion buscarAsignacionActivaPorPaciente(int codigo_campana) {
        CampanaPrevencion a = new CampanaPrevencion();
        String sql_select;
        sql_select = "SELECT * FROM  campana_prevencion "
                + "WHERE codigo_campana = '" + String.valueOf(codigo_campana) + "'";
        try {
            System.out.println("Se va a buscar la campaña en la bd");
            Connection conn = acceso.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            boolean encontro = false;
            while (tabla.next()) {
                encontro = true;
                a.setCodigo_campana(Integer.valueOf(tabla.getString(1)));
                a.setNombre(tabla.getString(2));
                a.setObjetivo(tabla.getString(3));
                a.setFecha(tabla.getString(4));
                a.setIdentificacion_empleado(Integer.parseInt(tabla.getString(5)));
                System.out.println("ok");
            }

            if (encontro) {
                return a;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);

        }
        return null;
    }

    public boolean actualizarCampanaPrevencion(CampanaPrevencion c) {
        //numero_cama, codigo_area, descripcion, estado
        String sql_select;
        sql_select = "UPDATE campana_prevencion "
                + "SET "
                + "codigo_campana = '" + String.valueOf(c.getCodigo_campana()) + "', "
                + "nombre = '" + c.getNombre() + "', "
                + "objetivo = '" + c.getObjetivo() + "', "
                + "fecha_realizacion = '" + c.getFecha() + "', "
                + "identificacion_empleado = '" + String.valueOf(c.getIdentificacion_empleado()) + "' "
                + " WHERE codigo_campana = '" + String.valueOf(c.getCodigo_campana()) + "' ";
        System.out.println(sql_select);
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando area  en  bd");
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

    
}
