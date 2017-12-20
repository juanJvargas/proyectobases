/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOEnfermera;
import java.util.ArrayList;
import logica.Enfermera;

/**
 *
 * @author juan
 */
public class ControladorEnfermera {

    DAOEnfermera daoEnfermera;

    public ControladorEnfermera() {
        daoEnfermera = new DAOEnfermera();
        
    }

    public boolean agregarEnfermera(Enfermera enfermera) {
        boolean resultado = daoEnfermera.insertEnfermera(enfermera);
        System.out.println(resultado);
        return resultado;
    }

    public Enfermera consultarEnfermera(int codigo) {
        Enfermera empleado = new Enfermera();
        System.out.println("Se va a consultar un area");
        empleado = daoEnfermera.consultarEnfermera(codigo);
        return empleado;

    }

    public boolean modificarEnfermera(Enfermera enfermera) {
        boolean resultado = daoEnfermera.updateenfermera(enfermera);
        System.out.println(resultado);
        return resultado;
    }

    public String[] habilidadesEnfermera(int codigo) {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoEnfermera.habilidadesesEnfermera(codigo);
        System.out.print(ve);
        String[] respuesta = ve.get(0).split(",");
        return respuesta;
    }

    public ArrayList<String> habilidades() {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoEnfermera.habilidades();
        System.out.print(ve);

        return ve;
    }

    public boolean buscarHabilidades(String[] habilidades){
        for (int i = 0; i < habilidades.length; i++) {
            ArrayList lista= habilidades();
            if(!lista.contains(habilidades[i])){
                return false;
            }
        }
        return true;
    }
}
