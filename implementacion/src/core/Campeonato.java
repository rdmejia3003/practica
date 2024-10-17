/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.personas.Jugador;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author hp-2522-la
 */
public class Campeonato {
    
    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos = new ArrayList<>();
    }
    
    public boolean addJuego(Juego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
            return true;
        }
        return false;
    }
    
    public Juego getJuego(int index) {
        return this.juegos.get(index);
    }
       public HashMap<Jugador, Integer> getFrecuenciaJugadoresSets() {
        HashMap<Jugador, Integer> frecuenciaJugadoresSets = new HashMap<>();
        for (Juego juego : this.juegos) {
            if (!frecuenciaJugadoresSets.containsKey(juego.getJugador1())) {
                frecuenciaJugadoresSets.put(juego.getJugador1(), 0);
            }
            if (!frecuenciaJugadoresSets.containsKey(juego.getJugador2())) {
                frecuenciaJugadoresSets.put(juego.getJugador2(), 0);
            }
            for (Jugador jugador : juego.getSetWinners()) {
                frecuenciaJugadoresSets.put(jugador, frecuenciaJugadoresSets.get(jugador) + 1);
            }
        }
        return frecuenciaJugadoresSets;
    }
    
    public void showResumen() {
        for (Juego juego : this.juegos) {
            System.out.println("Jugador 1: " + juego.getJugador1().getNombre());
            System.out.println("Jugador 2: " + juego.getJugador2().getNombre());
            System.out.println("Juez: " + juego.getJuez().getNombre());
            int index = 1;
            for (Set set : juego.getSets()) {
                System.out.println("Set " + index + ": " + set.getPuntosJugador1() + " - " + set.getPuntosJugador2());
                index++;
            }
            System.out.println("Ganador: " + juego.getWinner().getNombre() + "\n");
        }
        System.out.println("El ganador del campeonato es: " + this.juegos.get(this.juegos.size() - 1).getWinner().getNombre() + "\n");
    }
    
}

    

