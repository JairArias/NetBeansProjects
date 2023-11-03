/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Pelicula;
import ejercicio4_cine.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ryzen
 */
public class PeliculaServicio {

    ArrayList<Pelicula> lista = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void CrearPelicula() {
        boolean crear = false;
        do {
            Pelicula pe = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            pe.setPelicula(leer.nextLine());
            System.out.println("Ingrese el director de la pelicula");
            pe.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion de la pelicula en horas");
            pe.setDuracion(leer.nextDouble());
            leer.nextLine();

            lista.add(pe);
            System.out.println("Desea crear otra pelicula S/N");
            String opc;
            do {
                opc = leer.nextLine();
                if (opc.equals("S") || opc.equals("N")) {
                    crear = opc.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta invalida. Ingrese S o N");
                }
            } while (opc.equalsIgnoreCase("S") && opc.equalsIgnoreCase("N"));
        } while (crear);

    }

    public void MostrarPeliculas() {
        System.out.println("Listado total de las peliculas");
        for (Pelicula mostrar : lista) {
            System.out.println(mostrar);
        }
    }

    public void PeliculasDur1() {
        System.out.println("Peliculas con duracion mayor de 1 hora");
        for (Pelicula mostrar : lista) {
            if (mostrar.getDuracion() > 1) {
                System.out.println(mostrar);
            }

        }
    }

    public void OrdenarMayorMenor() {
        System.out.println("Peliculas ordenadas por duracion ascendenten");
        Collections.sort(lista, Comparadores.ordenarPorDuracionAsc);
        for (Pelicula mostrar : lista) {
            System.out.println(mostrar);
        }
    }

    public void OrdenarMenorMayor() {
        System.out.println("Peliculas ordenadas por duracion descendente");
        Collections.sort(lista, Comparadores.ordenarPorDuracionDesc);
        for (Pelicula mostrar : lista) {
            System.out.println(mostrar);
        }
    }
    
     public void OrdenarTitulo() {
        System.out.println("Peliculas ordenadas por titulo");
        Collections.sort(lista, Comparadores.ordenarPorTitulo);
        for (Pelicula mostrar : lista) {
            System.out.println(mostrar);
        }
    }
     
      public void OrdenarArtista() {
        System.out.println("Peliculas ordenadas por director");
        Collections.sort(lista, Comparadores.ordenarPorDirector);
        for (Pelicula mostrar : lista) {
            System.out.println(mostrar);
        }
    }
}
