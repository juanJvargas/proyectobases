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
import logica.Empleado;

/**
 *
 * @author juan
 *
 *
 */
public class DAOEmpleado {

    AccesoBD acceso;

    public DAOEmpleado() {
        acceso = new AccesoBD();
    }

    public boolean insertarEmpleado(Empleado empleado) {
        String sql_select, ide_jefe;
        if(empleado.getIdentificacion_jefe()==0){
            ide_jefe="null";
        }else{
            ide_jefe=String.valueOf(empleado.getIdentificacion_jefe());
        }
        sql_select = "INSERT INTO empleado"
                + " VALUES('" + String.valueOf(empleado.getIdentificacion_empleado())
                + "','" + empleado.getDireccion()
                + "','" + empleado.getTelefono()
                + "','" + empleado.getNombre()
                + "','" + empleado.getEmail()
                + "','" + String.valueOf(empleado.getSalario())
                + "','" + String.valueOf(empleado.getCodigo_area())
                + "'," + ide_jefe
                + ",'" + empleado.getEstado() + "')";
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

    public Empleado consultarEmpleado(int codigo) {
        Empleado empleado = new Empleado();
        String sql_select;
        sql_select = "SELECT * FROM empleado WHERE identificacion_empleado='" + codigo + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la empleado en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {

                empleado.setIdentificacion_empleado(Integer.parseInt(tabla.getString(1)));
                empleado.setDireccion(tabla.getString(2));
                empleado.setTelefono(tabla.getString(3));
                empleado.setNombre(tabla.getString(4));
                empleado.setEmail(tabla.getString(5));
                empleado.setSalario(Integer.valueOf(tabla.getShort(6)));
                empleado.setCodigo_area(Integer.parseInt(tabla.getString(8)));
                empleado.setIdentificacion_jefe(Integer.parseInt(tabla.getString(9)));
                empleado.setEstado(tabla.getString(10));

                System.out.println("ok");
            }

            return empleado;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean updateEmpleado(Empleado empleado) {
        String sql_select;
        sql_select = "UPDATE empleado "
                + "SET "
                + "identificaion_empleado='" + empleado.getIdentificacion_empleado() + "', "
                + "direccion='" + empleado.getDireccion() + "', "
                + "telefono='" + empleado.getTelefono() + "', "
                + "nombre='" + empleado.getNombre() + "', "
                + "email='" + empleado.getEmail() + "', "
                + "salario='" + empleado.getSalario() + "', "
                + "codigo_area='" + empleado.getCodigo_area() + "', "
                + "identificacion_jefe='" + empleado.getIdentificacion_jefe() + "', "
                + "estado='" + empleado.getEstado() + "', "
                + "' WHERE idenitfiacion_empleado='" + empleado.getIdentificacion_empleado() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando empleado  en  bd");
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

    public ArrayList<String> todosEmpleados() {
        Empleado s = new Empleado();
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT * FROM  empleado WHERE estado='activa'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
                ve.add((tabla.getString(4)));

            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

     public ArrayList<String> todosjefes() {
        Empleado s = new Empleado();
        String sql_select;
        ArrayList<String> ve = new ArrayList<String>();

        sql_select = "SELECT * FROM  empleado WHERE estado='activa'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando la sede en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ve.add((tabla.getString(1)));
                ve.add((tabla.getString(4)));

            }
            return ve;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }

}
