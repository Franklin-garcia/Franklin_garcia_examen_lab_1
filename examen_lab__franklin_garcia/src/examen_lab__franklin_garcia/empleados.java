/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_lab__franklin_garcia;

/**
 *
 * @author Franklin Garcia
 */
public class empleados extends persona{
    protected String empleo;

    public empleados() {
        super();
    }

    public empleados(String empleo, String nombre, int edad, String ID, String ID_loteria, String departamento, int dinero) {
        super(nombre, edad, ID, ID_loteria, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
