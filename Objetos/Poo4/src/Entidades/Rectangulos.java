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
public class Rectangulos {
    private Double base;
    private Double altura;
    
    //constructor

    public Rectangulos(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulos() {
    }

    //gett & sett
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulos{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
