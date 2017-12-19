/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.*;
import java.util.ArrayList;
import logica.*;
/**
 *
 * @author jdtorres
 */
public class ControladorFormulaMedicamento {
    DAOFormulaMedicamento daoFM;
    
    public ControladorFormulaMedicamento(){
        daoFM = new DAOFormulaMedicamento();
    }
    
    public boolean insertarFormulaMedicamento(FormulaMedicamento f){
        return daoFM.insertarFormulaMedicamento(f);
    }
    public ArrayList<FormulaMedicamento> consultarFormulaMedicamento(String codigoFormula){
        return daoFM.consultarFMF(codigoFormula);
    }
}
