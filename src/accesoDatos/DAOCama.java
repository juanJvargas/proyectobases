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
import logica.Cama;

/**
 *
 * @author tovar
 */
public class DAOCama {

    AccesoBD acceso;
    
    public DAOCama(){
        acceso = new AccesoBD();
    }
    
    public boolean insertarCama(Cama c) {
        String sql_select;
        sql_select = "INSERT INTO Cama ("
                + "numero_cama, "
                + "codigo_area, "
                + "descripcion, "
                + "estado "
                + "VALUES ("
                + "'" + c.getNumeroCama() + "',"
                + "'" + c.getCodigoArea() + "', "
                + "'" + c.getDescripcion() + "', "
                + "'" + c.getEstado() + "')";
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

    public Cama consultarCama(int numeroCama) {
        Cama c = new Cama();
        String sql_select;
        sql_select = "SELECT numero_cama, codigo_area, descripcion, estado FROM  Cama WHERE numero_cama ='" + String.valueOf(numeroCama) + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                c.setNumeroCama(Integer.valueOf(tabla.getString(1)));
                c.setCodigoArea(Integer.valueOf(tabla.getString(2)));
                c.setDescripcion(tabla.getString(3));
                c.setEstado(tabla.getString(4));

                System.out.println("ok");
            }
        } catch (SQLException e) {
            System.out.println(e);
            c.setNumeroCama(-1); //codigo -1 error en sql
        } catch (Exception e) {
            System.out.println(e);
            c.setNumeroCama(-2); //codigo -2 desconocido
            
        }
        return c;
    }
    
    public boolean actualizarCama(Cama c) {
        //numero_cama, codigo_area, descripcion, estado
        String sql_select;
        sql_select = "UPDATE Cama "
                + "SET "
                + "codigo_area = '" + String.valueOf(c.getCodigoArea()) + "', "
                + "descripcion = '" + c.getDescripcion() + "', "
                + "estado = '" + c.getDescripcion() + "', "
                + "' WHERE numero_cama ='" + String.valueOf(c.getNumeroCama()) + "' ";
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

}
