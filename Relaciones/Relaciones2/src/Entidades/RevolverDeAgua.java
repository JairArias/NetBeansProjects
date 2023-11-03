/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Ryzen
 */
public class RevolverDeAgua {

    private final Random rand = new Random();
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        posicionActual = 1 + rand.nextInt(6);
        posicionAgua = 1 + rand.nextInt(6);
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        if (++posicionActual > 6) {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
