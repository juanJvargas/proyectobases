/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import logica.Empleado;
import accesoDatos.DAOEmpleado;
import java.util.ArrayList;
/**
 *
 * @author juan
 */
public class ControladorEmpleado {
    DAOEmpleado daoEmpleado;
    
    public ControladorEmpleado(){
        daoEmpleado= new DAOEmpleado();
    }
    public boolean agregarEmpleado(Empleado empleado) {
        boolean resultado = daoEmpleado.insertarEmpleado(empleado);
        System.out.println(resultado);
        return resultado;
    }

    public Empleado consultarEmpleado(int codigo) {
        Empleado empleado = new Empleado();
        System.out.println("Se va a consultar un areasss");
        empleado = daoEmpleado.consultarEmpleado(codigo);
        return empleado;

    }

    public boolean modificarEmpleado(Empleado empleado) {
        boolean resultado = daoEmpleado.updateEmpleado(empleado);
        System.out.println(resultado);
        return resultado;
    }

    public ArrayList<String> retornarEmpleados() {
        ArrayList<String> ve = new ArrayList<String>();
        ve = daoEmpleado.todosEmpleados();
        System.out.print(ve);
        return ve;
    }
    
    
}
