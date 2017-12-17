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
public class Asignacion {
    private int numeroCama;
    private int identificacionPaciente;
    private String estado;
    private String fechaAsignacion;
    private String fechaRetiro;
    
    public Asignacion(){
        numeroCama = 0;
        identificacionPaciente = 0;
        estado = "";
    }
    
    public int getNumeroCama(){
        return numeroCama;
    }
    
    public int getIdentificacionPaciente(){
        return identificacionPaciente;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getFechaAsignacion(){
        return fechaAsignacion;
    }
    
    public String getFechaRetiro(){
        return fechaRetiro;
    }
    
    public void setNumeroCama(int nuevoNumeroCama){
        numeroCama = nuevoNumeroCama;
    }
    
    public void setIdentificacionPaciente(int nuevaIdentificacionPaciente){
        identificacionPaciente = nuevaIdentificacionPaciente;
    }
    
    public void setEstado(String nuevoEstado){
        estado = nuevoEstado;
    }
    
    public void setFechaAsignacion(String nuevaFechaAsignacion){
        fechaAsignacion = nuevaFechaAsignacion;
    }
    
    public void setFechaRetiro(String nuevaFechaRetiro){
        fechaRetiro = nuevaFechaRetiro;
    }
    
    
    
}
