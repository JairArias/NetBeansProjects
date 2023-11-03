/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_perro2;

import Servicio.ServicioPerro2;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Ejercicio2_Perro2 {

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
        ServicioPerro2 sp = new ServicioPerro2();
        do {
            
            sp.ingresarPerro2();
            System.out.println("Digite S si desea ingresar una mascota, N para salir");
            opc = leer.next();

        } while (opc.equals("S"));

        sp.mostrarPerros2();
        
        sp.eliminarPerros2();
        
       sp.mostrarPerros2();
            
        
    }
    
}
