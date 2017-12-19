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
 * @author juand
 */
public class ControladorPaciente {
    DAOPaciente daopaciente;
    
    public ControladorPaciente(){
        daopaciente = new DAOPaciente();
    }
    
    public boolean agregarPaciente(Paciente paciente){
        return daopaciente.insertarPaciente(paciente);
    }
    public Paciente consultarPaciente(String idPaciente){
        return daopaciente.consultarPaciente(idPaciente);
    }
    public ArrayList<Paciente> consultarPacientes(){
        return daopaciente.consultarPacientes();
    }
}
