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
public class FormulaMedicamento {
    String codigo_formula,codigo_medicamento, cantidad;
    
    public FormulaMedicamento(){
        
    }

    public String getCodigo_formula() {
        return codigo_formula;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCodigo_formula(String codigo_formula) {
        this.codigo_formula = codigo_formula;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
