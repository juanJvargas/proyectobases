/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DAOCama;
import logica.Cama;

/**
 *
 * @author tovar
 */
public class ControladorCama {

    DAOCama daoCama;

    public ControladorCama() {
        daoCama = new DAOCama();
    }

    public Cama consultarCama(int codigoCama) {
        Cama c = new Cama();
        c = daoCama.consultarCama(codigoCama);
        return c;
    }

    public boolean actualizarCama(Cama c) {
        return daoCama.actualizarCama(c);
    }

    public boolean insertarCama(Cama c) {
        return daoCama.insertarCama(c);
    }

}
