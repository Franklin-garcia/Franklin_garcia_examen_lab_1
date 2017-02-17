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
public class persona {
      
    protected String nombre;
    protected int edad;
    protected String ID;
    protected String ID_loteria;
    protected String departamento;
    protected int dinero;

    public persona() {
    }

    public persona(String nombre, int edad, String ID, String ID_loteria, String departamento, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.ID_loteria = ID_loteria;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID_loteria() {
        return ID_loteria;
    }

    public void setID_loteria(String ID_loteria) {
        this.ID_loteria = ID_loteria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + ", ID_loteria=" + ID_loteria + ", departamento=" + departamento + ", dinero=" + dinero + '}';
    }
    
}
