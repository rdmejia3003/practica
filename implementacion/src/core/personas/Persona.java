/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.personas;

/**
 *
 * @author hp-2522-la
 */
public abstract class Persona {
    
    protected String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
}
