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
public class politico extends persona{
    protected String partido;
    public politico() {
        super();
    }

    public politico(String partido, String nombre, int edad, String ID, String ID_loteria, String departamento, int dinero) {
        super(nombre, edad, ID, ID_loteria, departamento, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
