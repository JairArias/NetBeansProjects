/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Servicio.ServicioPerro;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opc;

        System.out.println("Bienvenido al registro de la raza de su perro");
        System.out.println("Digite S si desea ingresar una mascota, N para salir");
        opc = leer.next ();
        ServicioPerro sp = new ServicioPerro();
        do {
            
            sp.ingresarPerro();
            System.out.println("Digite S si desea ingresar una mascota, N para salir");
            opc = leer.next();

        } while (opc.equals("S"));

        sp.mostrarPerros();

    }

}
