/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.DiscountCalculator;

/**
 *
 * @author Ryzen
 */
public class DiscountCalculatorServicios {
    
    public Double desc10(DiscountCalculator d){
        return d.getPrecio()* d.getDescuento();
    }
 public Double desc25(DiscountCalculator d){
        return d.getPrecio()* d.getDescuento();
    }
 public Double desc50(DiscountCalculator d){
        return d.getPrecio()* d.getDescuento();
    }
 public Double desc75(DiscountCalculator d){
        return d.getPrecio()* d.getDescuento();
    }
 public Double sinDesc(DiscountCalculator d){
        return d.getPrecio();
    }
}

