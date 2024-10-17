/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.personas;

import core.Juego;
import java.util.ArrayList;

/**
 *
 * @author hp-2522-la
 */
public class Jugador extends Persona {
    
    private int sueldo;
    private ArrayList<Juego>juegos;

    public Jugador(String nombre,int sueldo) {
        super(nombre);
        this.juegos = new ArrayList<>();
        this.sueldo = sueldo;
    }
        
    public boolean addJuego(Juego juego){
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
            return true;  
    }
        return false;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

   
    

   
  
    
}
