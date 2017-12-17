/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOAsignacion;
import logica.Asignacion;

/**
 *
 * @author tovar
 */
public class ControladorAsignacion {

    DAOAsignacion dao;

    public ControladorAsignacion() {
        dao = new DAOAsignacion();
    }

    public boolean insertarAsignacion(Asignacion a) {
        return dao.insertarAsignacion(a);
    }

    public Asignacion buscarAsignacionActivaPorPaciente(int identificacionPaciente) {
        return dao.buscarAsignacionActivaPorPaciente(identificacionPaciente);
    }

    public Asignacion buscarAsignacionActivaPorCama(int numeroCama) {
        return dao.buscarAsignacionActivaPorCama(numeroCama);
    }
    
    public boolean liberarAsignacion(int identificacionPaciente){
        return dao.liberarAsignacion(identificacionPaciente);
    }
}
