/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juan
 */
public class Empleado {

    int identificacion_empleado, salario, codigo_area, identificacion_jefe;
    String direccion, telefono, nombre, email, cargo, estado;

    public Empleado() {
        identificacion_jefe = 0;
        salario = 0;
        codigo_area = 0;
        identificacion_empleado = 0;
        direccion = "";
        telefono = "";
        nombre = "";
        email = "";
        cargo = "";
        estado = "";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCodigo_area() {
        return codigo_area;
    }

    public void setCodigo_area(int codigo_area) {
        this.codigo_area = codigo_area;
    }

    public int getIdentificacion_empleado() {
        return identificacion_empleado;
    }

    public void setIdentificacion_empleado(int identificacion_empleado) {
        this.identificacion_empleado = identificacion_empleado;
    }

    public int getIdentificacion_jefe() {
        return identificacion_jefe;
    }

    public void setIdentificacion_jefe(int identificacion_jefe) {
        this.identificacion_jefe = identificacion_jefe;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
