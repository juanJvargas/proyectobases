/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.*;
import logica.Cama;
import logica.CampanaPrevencion;
/**
 *
 * @author juan
 */
public class ControladorCampanaPrevencion {
    DAOCampana_prevencion campana= new DAOCampana_prevencion();

    public ControladorCampanaPrevencion() {
    }
    public boolean insertarCampana(CampanaPrevencion campa){
        return campana.insertarCampanaPrevencion(campa);
    }
    public CampanaPrevencion buscarCampana(int codigo){
        System.out.println("controlador");
        return campana.buscarAsignacionActivaPorPaciente(codigo);
    }
    public boolean actualizarCampanaPrevencion(CampanaPrevencion campa){
        return campana.actualizarCampanaPrevencion(campa);
    }
    
}
