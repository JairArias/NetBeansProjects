/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_cine.utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Ryzen
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getPelicula().compareTo(t2.getPelicula());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getDirector().compareTo(t2.getDirector());
        }
    };
}
