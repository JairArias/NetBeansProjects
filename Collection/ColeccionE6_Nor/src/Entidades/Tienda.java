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
public class Tienda {
    
    private String producto;
    private double precio;
    
    //constructor

    public Tienda() {
    }

    public Tienda(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    
    //gett & setter

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + producto + ", precio=" + precio + '}';
    }
    
    
    
    
}
