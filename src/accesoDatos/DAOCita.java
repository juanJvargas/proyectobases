/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Cita;

/**
 *
 * @author tovar
 */
public class DAOCita {

    AccesoBD acceso;

    public DAOCita() {
        acceso = new AccesoBD();
    }

    public boolean insertarCita(Cita cita) {

        String sql_select = "INSERT INTO cita"
                + " VALUES('" + cita.getIdentificacionPaciente()
                + "','" + cita.getIdentificacionEmpleado()
                + "','" + cita.getFecha()
                + "','" + cita.getHora() +"')";
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
}
