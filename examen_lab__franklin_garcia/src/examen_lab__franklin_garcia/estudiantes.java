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
public class estudiantes extends persona{
    protected String carrera;

    public estudiantes() {
        super();
    }

    public estudiantes(String carrera, String nombre, int edad, String ID, String ID_loteria, String departamento, int dinero) {
        super(nombre, edad, ID, ID_loteria, departamento, dinero);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
