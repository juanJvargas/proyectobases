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
import java.util.Calendar;
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
        String sql = "select identificacion_paciente, nombre, fecha, hora, atendida from cita natural join paciente where identificacion_empleado = '" + identificacionMedico + "' and fecha >= '" + fechaInferior + "' and fecha < '" + fechaSuperior + "'";
        System.out.println(sql);
        return consultarSentencia(sql);
    }

    public ResultSet obtenerModeloCitasHOY(int idmedico) {
        java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        String sql = "select identificacion_paciente, nombre, fecha, hora, atendida from cita natural join paciente where identificacion_empleado = '" + idmedico + "' and fecha = '" + sqlDate.toString() + "'";
        System.out.println(sql);
        return consultarSentencia(sql);
    }

    public ResultSet obtenerMedicamentosDeFormula(int idpaciente, int idmedico, String fecha) {
        String sql = "select medicamento.codigo_medicamento as codigo_medicamento, medicamento.nombre as nombre, medicamento.cantidad as cantidad from formula_medicamento inner join medicamento on formula_medicamento.codigo_medicamento = medicamento.codigo_medicamento "
                + "where codigo_formula = \n"
                + "(select codigo_formula from formula where identificacion_empleado = '" + idmedico + "' and identificacion_paciente = '" + idpaciente + "' and fecha = '" + fecha + "')";
        System.out.println(sql);
        return consultarSentencia(sql);
    }

    public ResultSet obtenerModeloCitasAtendidasPorMedico(String fechaInferior, String fechaSuperior) {
        String sql = "select identificacion_empleado, nombre, atendidas from empleado natural join ("
                + " select identificacion_empleado, count(atendida) as atendidas from medico natural join cita  where fecha >= '" + fechaInferior + "' and fecha < '" + fechaSuperior + "' and atendida = 'si' group by identificacion_empleado "
                + "UNION\n"
                + "select identificacion_empleado, 0 as atendidas from medico\n"
                + "WHERE identificacion_empleado \n"
                + "NOT IN  ( SELECT identificacion_empleado FROM medico NATURAL JOIN cita WHERE fecha >= '" + fechaInferior + "' and fecha < '" + fechaSuperior + "' and atendida = 'si')) T";
        System.out.println(sql);
        return consultarSentencia(sql);
    }

}
