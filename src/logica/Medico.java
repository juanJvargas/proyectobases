/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juan
 */
public class Medico {

    int identificacion_empleado;
    String numero_licencia, universidad, codigo_especialidad;

    public Medico() {
        identificacion_empleado = 0;
        codigo_especialidad = "";
        numero_licencia = "";
        universidad = "";

    }

    public int getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public void setIdentificacion_empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public String getCodigo_especialidad() {
        return codigo_especialidad;
    }

    public void setCodigo_especialidad(String codigo_especialidad) {
        this.codigo_especialidad = codigo_especialidad;
    }

    public String getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

}
