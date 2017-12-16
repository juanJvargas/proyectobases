/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package controlador;

/**
 *
 * @author jdtorres
 */

import accesoDatos.*;
import logica.*;


public class ControladorUsuarios {
    DAOUsuarios daoUsuario;

    public ControladorUsuarios() {
        daoUsuario = new DAOUsuarios();
    }
    
    public Usuario consultarUsuario(String login) {
        //Vector v= new Vector();

        Usuario u = new Usuario();

        System.out.println("Se va a consultar un usuario");

        u = daoUsuario.consultarUsuario(login);

        return u;
    }
    
    public  boolean existeUsuario(String login) {
        boolean respuesta = daoUsuario.existeUsuario(login);
        return respuesta;
    }
    
    public boolean agregarUsuario(Usuario u) {
        
        boolean respuesta = daoUsuario.insertarUsuario(u);
        System.out.println(respuesta);
        return respuesta;
        
    }
    
    public boolean modificarUsuario(Usuario u){
        boolean respuesta = daoUsuario.updateUsuario(u);
        System.out.println(respuesta);
        return respuesta;
    }
    
    public boolean modificarPassUsuario(Usuario u){
        boolean respuesta = daoUsuario.updatePassUsuario(u);
        System.out.println(respuesta);
        return respuesta;
    }
    
    public void cerrarConexionBD() {
        daoUsuario.cerrarConexionBD();
    }
}
