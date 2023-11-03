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

    private Integer posicionactual;
    private Integer posicionagua;

    //constructor
    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionactual, Integer posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    //Gett & Setter
    public Integer getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(Integer posicionactual) {
        this.posicionactual = posicionactual;
    }

    public Integer getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(Integer posicionagua) {
        this.posicionagua = posicionagua;
    }

    /**
     * Llena la posicion actual del tambor y la poscicion del chorro de agua
     *
     */
    public void LlenarRevolver() {
        Random variable = new Random();
        setPosicionactual((int) variable.nextInt(6 - 1 + 1) + 1);
        setPosicionagua((int) variable.nextInt(6 - 1 + 1) + 1);
    }

    /**
     * si la posicion del agua y del tambor coinciden moja al jugador
     *
     * @return verdadero si se moja o falso si no
     */
    public boolean Mojar() {
        boolean valida = false;
        if (getPosicionactual().equals(getPosicionagua())) {
            valida = true;
            System.out.println((getPosicionactual().intValue() == getPosicionagua().intValue()));
        }
        return valida;

    }

    /**
     * el tambor cambia a la siguiente posicion para ser disparado de nuevo
     *
     * @return
     */
    public int SiguienteChorro() {
        if (getPosicionactual().equals(6)) {
            setPosicionactual(1);
        } else {
            setPosicionactual(getPosicionactual() + 1);
        }
        return getPosicionactual();
    }

    /**
     * imprime las posiciones
     *
     */
    public void Mostrar() {

        String m = "Posicion actual revolver: " + getPosicionactual() + "; Posicion del agua: " + getPosicionagua();
        System.out.println(m);

    }

}
