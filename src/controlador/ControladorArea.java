/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Area;
import accesoDatos.DAOarea;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ControladorArea {

    DAOarea area;

    public ControladorArea() {
        area = new DAOarea();
    }

    public boolean agregarArea(Area area1) {
        boolean resultado = area.insertarArea(area1);
        System.out.println(resultado);
        return resultado;
    }

    public Area consultarArea(int codigo) {
        Area are = new Area();
        System.out.println("Se va a consultar un area");
        are = area.consultarArea(codigo);
        return are;

    }

    public boolean modificarArea(Area area1) {
        boolean resultado = area.updateArea(area1);
        System.out.println(resultado);
        return resultado;
    }

    public ArrayList<String> retornarAreas() {
        ArrayList<String> ve = new ArrayList<String>();
        ve = area.todasArea();
        System.out.print(ve);

        return ve;
    }
}
