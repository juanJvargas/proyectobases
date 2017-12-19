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
public class ControladorFormula {
    DAOFormula daoformula;
    
    public ControladorFormula(){
        daoformula = new DAOFormula();
        
    }
    public boolean insertarFormula(Formula f){
        System.out.println("Aqui");
        return daoformula.insertarFormula(f);
    }
    
    public Formula consultarFormula(String identificacionFormula){
        return daoformula.consultarFormula(identificacionFormula);
    }
    public ArrayList<Formula> consultarTodasFormulas(){
        return daoformula.consultarFormulas();
    }
    public ArrayList<Formula> consultarFormulasPaciente(String identificacionPaciente){
        return daoformula.consultarFormulasP(identificacionPaciente);
    } 
    public String consultarUltimaFormula(){
        return daoformula.consultarUF();
    }
}
