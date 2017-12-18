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
public class Enfermera {
    int identificacion_empleado, anos_experiencia;
    String codigo_habilidad;

    public Enfermera() {
        identificacion_empleado = 0;
        codigo_habilidad = "";
        anos_experiencia=0;

    }

    public int getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public void setIdentificacion_empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public String getCodigo_habilidad() {
        return codigo_habilidad;
    }

    public void setCodigo_habilidad(String codigo_habilidad) {
        this.codigo_habilidad = codigo_habilidad;
    }

    public int getAnos_experiencia() {
        return anos_experiencia;
    }

    public void setAnos_experiencia(int años_experiencia) {
        this.anos_experiencia = anos_experiencia;
    }

    

}
