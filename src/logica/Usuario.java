/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author temp
 */
public class Usuario {
    private String login, password, tipo, estado;
    
    
    public Usuario(){
        login = "";
        password = "";
        tipo = "";
        estado = "";
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public String getTipo(){
        return tipo;
    }
    public String getEstado(){
        return estado;
    }
}
