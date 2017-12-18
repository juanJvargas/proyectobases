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
public class Causa {
    int codigo_causa;
    String nombre, descripcion;

    public void setCodigo_causa(int codigo_causa) {
        this.codigo_causa = codigo_causa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo_causa() {
        return codigo_causa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
