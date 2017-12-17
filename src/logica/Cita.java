/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author tovar
 */
public class Cita {

    private int identificacionPaciente;
    private int identificacionEmpleado;
    private String fecha;
    private int hora;

    public int getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public void setIdentificacionPaciente(int identificacionPaciente) {
        this.identificacionPaciente = identificacionPaciente;
    }

    public void setIdentificacionEmpleado(int identificacionEmpleado) {
        this.identificacionEmpleado = identificacionEmpleado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getIdentificacionEmpleado() {
        return identificacionEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public Cita() {

    }

}
