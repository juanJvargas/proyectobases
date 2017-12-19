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
public class ControladorRegistro {
    DAORegistro daoregistro;
    
    public ControladorRegistro(){
        daoregistro = new DAORegistro();
    }
    
    public boolean insertarRegistro(Registro r){
        boolean resultado = daoregistro.insertarRegistro(r);
        return resultado;
    }
    public ArrayList<Registro> consultarRegistroP(String identificacion){
         return daoregistro.consultarRegistrosP(identificacion);
    }
    public ArrayList<Registro> consultarRegistroM(int identificacion){
         return daoregistro.consultarRegistrosM(identificacion);
    }
    public ArrayList<Registro> consultarRegistroR(String fecha1, String fecha2){
         return daoregistro.consultarRegistrosR(fecha1, fecha2);
    }
    
}
