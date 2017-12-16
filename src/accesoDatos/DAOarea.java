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

    public Area consultarArea(int codigo) {
        Area area = new Area();
        String sql_select;
        sql_select= "SELECT * FROM area WHERE codigo_area='"+codigo+"'";
         try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                
                area.setCodigo(Integer.parseInt(tabla.getString(1)));
                area.setNombre(tabla.getString(2));
                area.setDescripcion(tabla.getString(3));

                System.out.println("ok");
            }

            return area;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
