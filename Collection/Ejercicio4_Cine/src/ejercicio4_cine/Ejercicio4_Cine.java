/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_cine;

import java.util.Scanner;
import Servicio.PeliculaServicio;
import ejercicio4_cine.utilidades.Comparadores;
import java.util.Collections;

/**
 *
 * @author Ryzen
 */
public class Ejercicio4_Cine {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      
        PeliculaServicio ps = new PeliculaServicio();
        int opc = 0;
        do {

            menu();
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.CrearPelicula();
                    break;
                case 2:
                    ps.MostrarPeliculas();
                    break;
                case 3:
                    ps.PeliculasDur1();
                    break;
                case 4:
                    ps.OrdenarMayorMenor();
                    break;
                case 5:
                    ps.OrdenarMenorMayor();
                    break;
                case 6:
                    ps.OrdenarTitulo();
                    break;
                case 7:
                    ps.OrdenarArtista();
                    break;
                case 8:
                    System.out.println("Saliste del sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 8);

    }

    static void menu() {
        System.out.println("Bienvenido a su sistema de peliculas");
        System.out.println("favor digite la opcion a la que desea ingresar");
        System.out.println("1- Ingresar pelicula");
        System.out.println("2- Mostrar Peliculas");
        System.out.println("3- Mostrar Peliculas mayor a una hora");
        System.out.println("4- Ordenar peliculas por duracion de forma ascendente");
        System.out.println("5- Ordenar peliculas por duracion de forma descendente");
        System.out.println("6- Ordenar peliculas por titulo");
        System.out.println("7- Ordenar peliculas por director");
        System.out.println("8- Salir sistema");

    }

}
