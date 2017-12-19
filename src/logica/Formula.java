/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.logging.Logger;

/**
 *
 * @author jdtorres
 */
public class Formula {
    int codigoFormula, identificacionEmpleado, identificacionPaciente;
    String fecha;
    public Formula(){
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getCodigoFormula() {
        return codigoFormula;
    }

    public int getIdentificacionEmpleado() {
        return identificacionEmpleado;
    }

    public void setCodigoFormula(int codigoFormula) {
        this.codigoFormula = codigoFormula;
    }

    public void setIdentificacionEmpleado(int identificacionEmpleado) {
        this.identificacionEmpleado = identificacionEmpleado;
    }

    public void setIdentificacionPaciente(int identificacionPaciente) {
        this.identificacionPaciente = identificacionPaciente;
    }
    

    public int getIdentificacionPaciente() {
        return identificacionPaciente;
    }
    
}
