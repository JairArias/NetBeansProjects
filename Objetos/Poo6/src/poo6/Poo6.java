/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Poo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        CafeteraServicio cs = new CafeteraServicio();

        System.out.println("Bienvenido a su programa Nespresso");
        do {

            System.out.println("Ingrese la opcion a la cual desea ingresar");
            System.out.println("1- Llenar Cafetera");
            System.out.println("2- Servir taza de cafe");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cs.LlenarCafetera();
                    break;
                case 2:
                    cs.ServirTaza();
                    break;
                case 3:
                    cs.VaciarCafetera();
                    break;
                case 4:
                    cs.AgregarCafe();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("¡Digito una opcion errada!");
            }
        } while (opcion != 5);
        //Cafetera c1=cs.LlenarCafetera();cs.ServirTaza();cs.VaciarCafetera();cs.AgregarCafe();

    }

}
