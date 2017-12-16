/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Area;

/**
 *
 * @author juan
 */
public class DAOarea {

    AccesoBD acceso;

    public DAOarea() {
        acceso = new AccesoBD();
    }

    public boolean insertarArea(Area area) {
        String sql_select;
        sql_select = "INSERT INTO area"
                + "(codigo_area, nombre, descripcion)"
                + " VALUES('" + String.valueOf(area.getCodigo())
                + "','" + area.getNombre()
                + "','" + area.getDescripcion() + "')";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("insertando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    
}
