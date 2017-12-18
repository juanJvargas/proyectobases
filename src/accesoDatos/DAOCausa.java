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
import logica.*;

/**
 *
 * @author jdtorres
 */
public class DAOCausa {
    AccesoBD acceso;
    
    public DAOCausa(){
        acceso = new AccesoBD();
    }
    public boolean insertarCausa(Causa c) {
        String sql_select;
        sql_select = "INSERT INTO causa ("
                
                + "codigo_causa, "
                + "nombre, "
                
                + "descripcion "
                + "VALUES ('" + "'" + c.getCodigo_causa() + "', "
                + "'" + c.getNombre() + "', "
                + "'" + c.getDescripcion() + "')";
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
    } //End insertar

    public ArrayList<Causa> consultarCausas(){
        ArrayList<Causa> ca = new ArrayList<Causa>();
        
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM causa";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Causa aux = new Causa();
                aux.setCodigo_causa(Integer.valueOf(tabla.getString(1)));
                aux.setNombre(tabla.getString(2));
                aux.setDescripcion(tabla.getString(3));
                
                ca.add(aux); 
            }
            return ca;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
