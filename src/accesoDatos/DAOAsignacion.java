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
import logica.Asignacion;

/**
 *
 * @author tovar
 */
public class DAOAsignacion {

    AccesoBD acceso;

    public DAOAsignacion() {
        acceso = new AccesoBD();
    }

    public boolean insertarAsignacion(Asignacion a) {
        String sql_select;
        sql_select = "INSERT INTO asignado ("
                + "numero_cama, "
                + "identificacion_paciente, "
                + "fecha_asignacion, "
                + "estado_asignacion) "
                + "VALUES ("
                + "'" + String.valueOf(a.getNumeroCama()) + "',"
                + "'" + String.valueOf(a.getIdentificacionPaciente()) + "', "
                + " NOW(), "
                + "'activa')";
        System.out.println(sql_select);
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

    public Asignacion buscarAsignacionActivaPorPaciente(int identificacionPaciente) {
        Asignacion a = new Asignacion();
        String sql_select;
        sql_select = "SELECT numero_cama, identificacion_paciente, fecha_asignacion FROM  asignado "
                + "WHERE identificacion_paciente = '" + String.valueOf(identificacionPaciente) + "' and estado_asignacion = 'activa'";
        try {
            Connection conn = acceso.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            boolean encontro = false;
            while (tabla.next()) {
                encontro = true;
                a.setNumeroCama(Integer.valueOf(tabla.getString(1)));
                a.setIdentificacionPaciente(Integer.valueOf(tabla.getString(2)));
                a.setFechaAsignacion(tabla.getString(3));
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

    public Asignacion buscarAsignacionActivaPorCama(int numeroCama) {
        Asignacion a = new Asignacion();
        String sql_select;
        sql_select = "SELECT numero_cama, identificacion_paciente, fecha_asignacion FROM  asignado "
                + "WHERE numero_cama = '" + String.valueOf(numeroCama) + "' and estado_asignacion = 'activa'";
        System.out.println(sql_select);
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            boolean encontro = false;
            while (tabla.next()) {
                encontro = true;
                a.setNumeroCama(Integer.valueOf(tabla.getString(1)));
                a.setIdentificacionPaciente(Integer.valueOf(tabla.getString(2)));
                a.setFechaAsignacion(tabla.getString(3));
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
    
    public boolean liberarAsignacion(int identificacionPaciente){
        String sql_select;
        sql_select = "UPDATE asignado "
                + "SET "
                + "estado_asignacion = 'inactiva', "
                + "fecha_retiro = NOW() "
                + "WHERE identificacion_paciente = '" + String.valueOf(identificacionPaciente) + "' "
                + "and estado_asignacion = 'activa'";
        System.out.println(sql_select);
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("liberando cama");
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
