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
import logica.Medicamento;

/**
 *
 * @author tovar
 */
public class DAOReportes {

    AccesoBD acceso;

    public DAOReportes() {
        acceso = new AccesoBD();
    }

    public ResultSet obtenerCitas() {
        String sql = "select * from cita";
        return consultarSentencia(sql);
    }

    public ResultSet consultarSentencia(String sql) {
        try {
            Medicamento me = new Medicamento();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            return tabla;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ResultSet obtenerCitasConMedicoFecha(int idmedico, String fecha) {
        String sql = "select identificacion_paciente, nombre, fecha, hora from cita natural join paciente where identificacion_empleado = '" + idmedico + "' and fecha = '" + fecha + "'";
        return consultarSentencia(sql);
    }

    public ResultSet obtenerModeloCitasConPaciente(int identificacionPaciente) {
        String sql = "select nombre as medico, fecha, hora from cita natural join empleado where identificacion_paciente = '" + identificacionPaciente + "' and fecha >= NOW()";
        return consultarSentencia(sql);
    }

    public ResultSet obtenerModeloAgendaMesMedico(int identificacionMedico, String fechaInferior, String fechaSuperior) {
        String sql = "select identificacion_paciente, nombre, fecha, hora from cita natural join paciente where identificacion_empleado = '" + identificacionMedico + "' and fecha >= '" + fechaInferior + "' and fecha < '"+fechaSuperior+"'";
        System.out.println(sql);
        return consultarSentencia(sql);
    }

}
