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
public class ControladorCausa {
    DAOCausa daocausa;
    
    public ControladorCausa(){
        daocausa = new DAOCausa();
    }
    
    public boolean insertarCausa(Causa c){
        return daocausa.insertarCausa(c);
    }
    
    public ArrayList<Causa> consultarCausas(){
        return daocausa.consultarCausas();
    }
}
