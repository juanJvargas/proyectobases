/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOCita;
import logica.Cita;

/**
 *
 * @author tovar
 */
public class ControladorCita {
    DAOCita dao;
    
    public ControladorCita(){
        dao = new DAOCita();
    }
    
    public boolean insertarCita(Cita cita) {
        return dao.insertarCita(cita);
    }
    
    
    
}
