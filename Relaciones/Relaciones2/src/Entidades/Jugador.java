/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ryzen
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public String getNombre() {
        return nombre;
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua r) {
        mojado = r.mojar();
        r.siguienteChorro();
        return mojado;
    }

    @Override
    public String toString() {
        return "\nJugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
}
