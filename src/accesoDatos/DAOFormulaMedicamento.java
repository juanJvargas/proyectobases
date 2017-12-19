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
public class DAOFormulaMedicamento {

    AccesoBD acceso;

    public DAOFormulaMedicamento() {
        acceso = new AccesoBD();
    }

    public boolean insertarFormulaMedicamento(FormulaMedicamento fm) {
        String sql_select = "INSERT INTO formula_medicamento VALUES ("
                + fm.getCodigo_formula() + ", "
                + fm.getCodigo_medicamento() + ", "
                + fm.getCantidad() + ")";
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
    
    public ArrayList<FormulaMedicamento> consultarFMF(String cod){
         try {
            ArrayList<FormulaMedicamento> fm = new ArrayList<FormulaMedicamento>();
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            String sql_select = "SELECT * FROM formula_medicamento WHERE codigo_formula = "+cod;
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                FormulaMedicamento fe = new FormulaMedicamento();
                fe.setCodigo_formula(tabla.getString(1));
                fe.setCodigo_medicamento(tabla.getString(2));
                fe.setCantidad(tabla.getString(3));
                fm.add(fe);
                System.out.println("ok");
            }
            return fm;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
