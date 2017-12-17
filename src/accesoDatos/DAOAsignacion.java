/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
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

}
