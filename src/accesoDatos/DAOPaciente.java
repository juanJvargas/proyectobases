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
import logica.Paciente;

/**
 *
 * @author tovar
 */
public class DAOPaciente {
    
    
    AccesoBD acceso;

    public DAOPaciente() {
        acceso = new AccesoBD();
    }

    public boolean insertarPaciente(Paciente paciente) {
        String sql_select, ide_jefe;

        sql_select = "INSERT INTO paciente"
                + " VALUES('" + String.valueOf(paciente.getIdentifiacacionPaciente())
                + "','" + paciente.getDireccion()
                + "','" + paciente.getTelefono()
                + "','" + paciente.getFechaNacimiento()
                + "','" + paciente.getActividadEconomica()
                + "','" + paciente.getSeguridadSocial()
                + "','" + paciente.getFechaApertura()+"')";
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
    

    public Paciente consultarPaciente(int identificacion_paciente) { 
        Paciente paciente = new Paciente();
        String sql_select;
        sql_select = "SELECT identificacion_paciente, "
                + "direccion, "
                + "telefono, "
                + "fecha_nacimiento, "
                + "actividad_economica, "
                + "seguridad_social, "
                + "fecha_apertura "
                + "FROM paciente";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la empleado en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                paciente.setIdentifiacacionPaciente(Integer.valueOf(tabla.getString(1)));
                paciente.setDireccion(tabla.getString(2));
                paciente.setTelefono(tabla.getString(3));
                paciente.setFechaNacimiento(tabla.getString(4));
                paciente.setActividadEconomica(tabla.getString(5));
                paciente.setSeguridadSocial(tabla.getString(6));
                paciente.setFechaApertura(tabla.getString(7));

                System.out.println("ok");
            }

            return paciente;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean updatePaciente(Paciente paciente) {
        String sql_select;
        sql_select = "UPDATE paciente "
                + "SET "
                + "identificacion_paciente='" + paciente.getIdentifiacacionPaciente() + "', "
                + "direccion='" + paciente.getDireccion()+ "', "
                + "telefono='" + paciente.getTelefono() + "', "
                + "fecha_nacimiento='" + paciente.getFechaNacimiento()+ "', "
                + "actividad_economica='" + paciente.getActividadEconomica() + "', "
                + "seguridad_social='" + paciente.getSeguridadSocial() + "', "
                + "fecha_apertura='" + paciente.getFechaApertura() + "', "
                + "' WHERE identificacion_paciente='" + String.valueOf(paciente.getIdentifiacacionPaciente()) + "' ";
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
    
}
