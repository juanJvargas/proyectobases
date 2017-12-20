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
public class CampanaPrevencion {

    int codigo_campana,identificacion_empleado;
    String nombre, objetivo, fecha;

    public CampanaPrevencion() {
        codigo_campana=0;
        identificacion_empleado=0;
        nombre="";
        objetivo="";
        fecha="";
    }

    public int getCodigo_campana() {
        return codigo_campana;
    }

    public void setCodigo_campana(int codigo_campana) {
        this.codigo_campana = codigo_campana;
    }

    public int getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public void setIdentificacion_empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
