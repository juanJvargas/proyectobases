/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import logica.Medico;

/**
 *
 * @author juand
 */
public class DAOMedico {

    AccesoBD acceso;

    public DAOMedico() {
        acceso = new AccesoBD();
    }

}
