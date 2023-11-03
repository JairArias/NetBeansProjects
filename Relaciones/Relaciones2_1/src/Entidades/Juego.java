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

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolverdeagua;

    //constructor
    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolverdeagua) {
        this.jugadores = jugadores;
        this.revolverdeagua = revolverdeagua;
    }

    //Gett & Setter
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolverdeagua() {
        return revolverdeagua;
    }

    public void setRevolverdeagua(RevolverDeAgua revolverdeagua) {
        this.revolverdeagua = revolverdeagua;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolverdeagua=" + revolverdeagua + '}';
    }

}
