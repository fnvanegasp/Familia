/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Familia {
    private String apellido;
    private Persona madre;
    private Persona padre;
    private Persona[] hijos;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.hijos = new Persona[2];
    }

    public Familia(String apellido, Persona madre, Persona padre, Persona[] hijos) {
        this.apellido = apellido;
        this.madre = madre;
        this.padre = padre;
        this.hijos = hijos;
    }
    
    public Persona[] listarMiembros(){
        return null;
    }
    
    public Persona buscarMiembro(String nombre){
        return null;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona[] getHijos() {
        return hijos;
    }

    public void setHijos(Persona[] hijos) {
        this.hijos = hijos;
    }

    
    
}
