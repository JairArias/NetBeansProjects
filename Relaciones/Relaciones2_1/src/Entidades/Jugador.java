/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Jugador {

    Scanner leer = new Scanner(System.in);
    //RevolverDeAgua ra = new RevolverDeAgua();

    private Integer id;
    private String jugador;
    private boolean mojado;

    //constructor
    public Jugador() {
        this.mojado = false;
    }

    public Jugador(Integer id, String jugador) {
        this.id = id;
        this.jugador = jugador;
        this.mojado = false;
    }

    //Gett Y Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id + 1;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador + id;
    }

    public boolean isMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", jugador=" + jugador + ", mojado=" + mojado + '}';
    }

    /**
     * llama el metodo para cargar la pistola llama el metodo de disparar, si se
     * moja muestra verdadero sino llama el metodo siguiente chorro que cambia
     * de posicion el tambor
     */
    public boolean disparo(RevolverDeAgua r) {
        mojado = r.Mojar();
        r.SiguienteChorro();
       // r.Mostrar();
        return mojado;
    }

}
