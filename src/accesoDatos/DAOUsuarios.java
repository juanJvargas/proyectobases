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
import logica.Usuario;

/**
 *
 * @author jdtorres
 */
public class DAOUsuarios {

    AccesoBD acceso;

    public DAOUsuarios() {
        acceso = new AccesoBD();
    }

    public boolean insertarUsuario(Usuario u) {
        String sql_select;
        sql_select = "INSERT INTO usuarios ("
                + "login, "
                + "contraseña, "
                + "tipo, "
                + "estado) "
                + "VALUES ('" + u.getLogin() + "',"
                + "'" + u.getPassword() + "', "
                + "'" + u.getTipo() + "', "
                + "'" + u.getEstado() + "')";
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
    
    public Usuario consultarUsuario(String login) {
        Usuario u = new Usuario();
        String sql_select;
        sql_select = "SELECT login, contraseña, tipo, estado FROM  usuarios WHERE login='" + login + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {

                u.setLogin(tabla.getString(1));
                u.setPassword(tabla.getString(2));
                u.setTipo(tabla.getString(3));
                u.setEstado(tabla.getString(4));

                System.out.println("ok");
            }

            return u;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }//end consultarUsuario

    public boolean existeUsuario(String login) {
        Usuario u = new Usuario();
        String sql_select;
        sql_select = "SELECT login FROM  usuarios WHERE login='" + login + "'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            if (!tabla.isBeforeFirst()) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;

    }

    public void cerrarConexionBD() {
        acceso.closeConection(acceso.getConnetion());
    }

    public boolean updatePassUsuario(Usuario u) {
        String sql_select;
        sql_select = "UPDATE usuarios "
                + "SET "
                + "contraseña='" + u.getPassword() + "' WHERE login='" + u.getLogin() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando en  bd");
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

    public boolean updateUsuario(Usuario u) {
        String sql_select;
        sql_select = "UPDATE usuarios "
                + "SET "
                + "tipo='" + u.getTipo() + "', "
                + "estado='" + u.getEstado() + "' WHERE login='" + u.getLogin() + "' ";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando en  bd");
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
