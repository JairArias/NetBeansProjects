/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_paises.utilidades;
import java.util.Comparator;
import Entidades.Paises;

/**
 *
 * @author Ryzen
 */
public class Comparadores {
    
    public static Comparator<String> ordenarPaisAs = new Comparator<String> () {
        @Override
        public int compare(String t1, String t2) {
       return t1.compareTo(t2);
        }
    };
    
}
