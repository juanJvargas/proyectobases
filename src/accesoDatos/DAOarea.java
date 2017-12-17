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
                + "','" + area.getDescripcion() 
                + "','" + area.getEstado() + "')";
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
        sql_select = "SELECT * FROM area WHERE codigo_area='" + codigo + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la area en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                area.setCodigo(Integer.parseInt(tabla.getString(1)));
                area.setNombre(tabla.getString(2));
                area.setDescripcion(tabla.getString(3));
                area.setEstado(tabla.getString(4));

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

    public ArrayList<String> todasArea() {
         Area s = new Area();
         String sql_select;
         ArrayList<String> ve= new ArrayList<String>();
         
        sql_select = "SELECT * FROM  area WHERE estado='activa'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
             while (tabla.next()) {
              ve.add((tabla.getString(1)));
              ve.add((tabla.getString(2)));
              
            }
           return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
          return null;
    }

    public boolean updateArea(Area area) {
        String sql_select;
        sql_select = "UPDATE area "
                + "SET "
                + "codigo='" + area.getCodigo() + "', "
                + "nombre='" + area.getNombre() + "', "
                + "descripcion='" + area.getDescripcion() + "', "
                + "estado='" + area.getEstado()+ "', "
                + "' WHERE codigo='" + String.valueOf(area.getCodigo()) + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando area  en  bd");
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

    public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }
}
