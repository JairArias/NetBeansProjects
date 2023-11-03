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
public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;
    private int tazaCafe;
    private int cafe;
    //constructor

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual, int tazaCafe, int cafe) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.tazaCafe = tazaCafe;
        this.cafe = cafe;
    }

    
    //sett & getter

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getTazaCafe() {
        return tazaCafe;
    }

    public void setTazaCafe(int tazaCafe) {
        this.tazaCafe = tazaCafe;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + ", tazaCafe=" + tazaCafe + ", cafe=" + cafe + '}';
    }

   
    
}

