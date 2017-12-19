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
public class Medicamento {
    int codigo_medicamento, cantidad, costo;
    String nombre, descripcion;
    
    public Medicamento(){
        
    }

    public int getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo_medicamento(int codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
