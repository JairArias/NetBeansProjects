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
public class DiscountCalculator {
    private Double precio;
    private Double descuento;
    
    //constructor

    public DiscountCalculator() {
    }

    public DiscountCalculator(Double precio, Double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }
    
    // gett & setter

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
