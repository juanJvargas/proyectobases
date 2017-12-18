/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author jdtorres
 */
public class Registro {

    int numero_registro, identificacion_paciente, identificacion_empleado, codigo_causa; //Debemos validar quien es el medico que está haciendo el registro
    String fecha, observaciones;

    public int getNumero_registro() {
        return numero_registro;
    }

    public void setCodigo_causa(int codigo_causa) {
        this.codigo_causa = codigo_causa;
    }

    public int getCodigo_causa() {
        return codigo_causa;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }

    public void setIdentificacion_paciente(int identificacion_paciente) {
        this.identificacion_paciente = identificacion_paciente;
    }

    public void setIdentificacion_empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getIdentificacion_paciente() {
        return identificacion_paciente;
    }

    public int getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

}
