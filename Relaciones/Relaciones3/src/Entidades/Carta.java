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
public class Carta {

    private Integer numero;
    private String palo;

    //constructor
    public Carta() {
    }

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    //gett & setter
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero + 1;

    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        // this.palo = palo;
        this.palo = " "+palo+" "+this.numero;
    }

}
