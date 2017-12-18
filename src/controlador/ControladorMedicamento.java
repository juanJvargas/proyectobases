/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.*;
import accesoDatos.*;
import java.util.ArrayList;

/**
 *
 * @author jdtorres
 */
public class ControladorMedicamento {
    DAOMedicamento daomedicamento;
    
    public ControladorMedicamento(){
        daomedicamento = new DAOMedicamento();
    }
    public boolean agregarMedicamento(Medicamento m){
        return daomedicamento.agregarMedicamento(m);
    }
    
    public ArrayList<Medicamento> consultarMedicamentos(){
        return daomedicamento.consultarMedicamentos();
    }
    
    public Medicamento consultarMedicamento(String id){
        return daomedicamento.consultarMedicamento(id);
    }
}
