/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Scanner;
import Entidades.Tienda;
import java.util.Map;

/**
 *
 * @author Ryzen
 */
public class TiendaServicios {

    Tienda ti = new Tienda();
    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> tiendamap = new HashMap();

    public void CrearProducto() {
        System.out.println("Ingrese un producto");
        ti.setProducto(leer.nextLine());
        System.out.println("Ingrese el precio del producto");
        ti.setPrecio(leer.nextDouble());
        leer.nextLine();
        tiendamap.put(ti.getProducto(), ti.getPrecio());

        System.out.println(" ");
    }

    public void modificarPrecio() {
        boolean nombre = false;
        System.out.println("Ingrese el nombre del producto");
        String prod = leer.nextLine();
        for (Map.Entry<String, Double> lista : tiendamap.entrySet()) {
            if (prod.equalsIgnoreCase(lista.getKey())) {
                System.out.println("Ingrese el valor nuevo del producto");
                lista.setValue(leer.nextDouble());
                leer.nextLine();
                nombre = true;
                break;
            }
        }

        if (nombre) {
            System.out.println("Se actualizo el valor del articulo de forma correcta");
        } else {
            System.out.println("No se encontro el articulo ingresado");
        }
        System.out.println(" ");
    }

    public void eliminarPrecio() {
        System.out.println("Ingrese el nombre del articulo a eliminar");
        String nom = leer.nextLine();
        boolean validacion = false;
        for (Map.Entry<String, Double> lista : tiendamap.entrySet()) {
            String key = lista.getKey();
            if (nom.equalsIgnoreCase(key)) {
                validacion = true;
                break;
            }

        }
        if (validacion) {
            tiendamap.remove(nom);
            System.out.println("Se elimino el producto!");

        } else {
            System.out.println("No se encontro el articulo");
        }

        System.out.println(" ");
    }

    public void mostrarProducto() {
        for (Map.Entry<String, Double> lista : tiendamap.entrySet()) {
            String key = lista.getKey();
            Double value = lista.getValue();
            System.out.println("Articulo " + key + "; Precio : $" + value);
        }
        System.out.println(" ");
    }

}
