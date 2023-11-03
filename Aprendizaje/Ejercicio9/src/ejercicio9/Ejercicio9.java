/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String palabra;
       String letra;
        letra = "a";
        System.out.println("Ingrese una frase");
        palabra = leer.next();
       
        if (palabra.substring(0,1).toLowerCase().equals(letra)){
            System.out.println("Correcto");
        }else{System.out.println("Incorrecto");

      
    }
    }   
}
