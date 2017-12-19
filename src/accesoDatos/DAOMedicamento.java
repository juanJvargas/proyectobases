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
public class DAOMedicamento {

    AccesoBD acceso;

    public DAOMedicamento() {
        acceso = new AccesoBD();
    }

    public boolean agregarMedicamento(Medicamento m) {
        String sql_select = "INSERT INTO medicamento VALUES ("
                + String.valueOf(m.getCodigo_medicamento()) + ", '"
                + m.getNombre() + "', '"
                + m.getDescripcion() + "', "
                + String.valueOf(m.getCosto()) + ", "
                + String.valueOf(m.getCantidad()) + ")";
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

    public ArrayList<Medicamento> consultarMedicamentos() {
        ArrayList<Medicamento> me = new ArrayList<Medicamento>();

        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM medicamento";
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Medicamento aux = new Medicamento();
                aux.setCodigo_medicamento(Integer.valueOf(tabla.getString(1)));
                aux.setNombre(tabla.getString(2));
                aux.setDescripcion(tabla.getString(3));
                aux.setCosto(Integer.valueOf(tabla.getString(4)));
                aux.setCantidad(Integer.valueOf(tabla.getString(5)));
                me.add(aux);
            }
            return me;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Medicamento consultarMedicamento(String id) {
        try {
            Medicamento me = new Medicamento();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM medicamento WHERE codigo_medicamento = " + id;
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                me.setCodigo_medicamento(Integer.valueOf(tabla.getString(1)));
                me.setNombre(tabla.getString(2));
                me.setDescripcion(tabla.getString(3));
                me.setCosto(Integer.valueOf(tabla.getString(4)));
                me.setCantidad(Integer.valueOf(tabla.getString(5)));
                System.out.println("ok");
            }
            return me;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
