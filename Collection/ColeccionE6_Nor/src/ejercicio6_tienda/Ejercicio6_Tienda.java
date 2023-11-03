/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_tienda;

import java.util.Scanner;
import Servicios.TiendaServicios;

/**
 *
 * @author Ryzen
 */
public class Ejercicio6_Tienda {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TiendaServicios ts = new TiendaServicios();

        int opc = 0;
        do {

            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ts.CrearProducto();
                    break;
                case 2:
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.eliminarPrecio();
                    break;
                case 4:
                    ts.mostrarProducto();
                    break;
                case 5:
                    System.out.println("Saliste del sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 5);

    }

    static void menu() {
        System.out.println("Bienvenido a su sistema de articulos");
        System.out.println("favor digite la opcion a la que desea ingresar");
        System.out.println("1- Ingresar articulo");
        System.out.println("2- Modificar precio articulo");
        System.out.println("3- Eliminar articulo");
        System.out.println("4- Mostrar lista de articulos");
        System.out.println("5- Salir sistema");

    }

}
