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
public class Cama {
    //Cama(numero_cama, descripcion, estado, codigo_area)
    private int numeroCama;
    private int codigoArea;
    private String descripcion = "";
    private String estado;
    
    public Cama(){
        numeroCama = 0; //cama no  existe
    }
    
    public int getNumeroCama(){
        return numeroCama;
    }
    
    public void setNumeroCama(int nuevoNumeroCama){
        numeroCama = nuevoNumeroCama;
    }
    
    public int getCodigoArea(){
        return codigoArea;
    }
    
    public void setCodigoArea(int nuevoCodigoArea){
        codigoArea = nuevoCodigoArea;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String nuevaDescripcion){
        descripcion = nuevaDescripcion;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String nuevoEstado){
        estado = nuevoEstado;
    }
    
}
