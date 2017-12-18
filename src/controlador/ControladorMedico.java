/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Medico;
import accesoDatos.DAOMedico;
import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class ControladorMedico {

    DAOMedico daoMedico;

    public ControladorMedico() {
        daoMedico = new DAOMedico();
    }

    public boolean agregarMedico(Medico medico) {
        boolean resultado = daoMedico.insertMEdico(medico);
        System.out.println(resultado);
        return resultado;
    }

    public Medico consultarMedico(int codigo) {
        Medico empleado = new Medico();
        System.out.println("Se va a consultar un area");
        empleado = daoMedico.consultarMedico(codigo);
        return empleado;

    }

    public boolean modificarMedico(Medico medico) {
        boolean resultado = daoMedico.updatemedico(medico);
        System.out.println(resultado);
        return resultado;
    }

    public String[] especialidadesMedico(int codigo) {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoMedico.especialidadesesMedico(codigo);
        System.out.print(ve);
        String[] respuesta = ve.get(0).split(",");
        return respuesta;
    }

    public ArrayList<String> especialidades() {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoMedico.especialidades();
        System.out.print(ve);
        return ve;
    }
    public ArrayList<String> todosMedicosLibresEnFechaHora(java.sql.Date fecha, int hora) {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoMedico.todosMedicosLibresEnFechaHora(fecha, hora);

        return ve;
    }

}
