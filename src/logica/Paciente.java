/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author tovar
 * 
 * 
DROP TABLE IF EXISTS paciente CASCADE;
CREATE TABLE paciente(
	identificacion_paciente INTEGER PRIMARY KEY,
	direccion VARCHAR(100),
	telefono VARCHAR(100),
	fecha_nacimiento DATE,
	actividad_economica VARCHAR(100),
	seguridad_social VARCHAR(100),
	fecha_apertura DATE
);
 */
public class Paciente {
    
    private String telefono;
    private String fechaNacimiento;
    private String actividadEconomica;
    private String seguridadSocial;
    private String fechaApertura;
    private String nombre;
    
    private int identifiacacionPaciente;

    public Paciente() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdentifiacacionPaciente(int identifiacacionPaciente) {
        this.identifiacacionPaciente = identifiacacionPaciente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    private String direccion;

    public int getIdentifiacacionPaciente() {
        return identifiacacionPaciente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }
    
    
}
