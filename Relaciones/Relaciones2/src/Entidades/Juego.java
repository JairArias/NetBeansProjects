/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Ryzen
 */
public class Juego {

    private final ArrayList<Jugador> jugadores;
    private final RevolverDeAgua revolverdeagua;
    private int jugadorActual;

    //constructor
    public Juego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.revolverdeagua = new RevolverDeAgua();
        revolverdeagua.llenarRevolver();
        jugadorActual = 0;
    }

    public boolean ronda() {
        Jugador jugador = jugadores.get(jugadorActual++);
        System.out.print(revolverdeagua.toString());
        boolean mojado = jugador.disparo(revolverdeagua);
        System.out.println(jugador.toString());
        if (mojado) {
            System.out.println(jugador.getNombre() + " MOJADO!");
        } else {
            System.out.println(jugador.getNombre() + " SALVADO!");
            if (jugadorActual == jugadores.size()) {
                jugadorActual = 0;
            }
        }
        return mojado;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", \nrevolverdeagua=" + revolverdeagua + '}';
    }

}
