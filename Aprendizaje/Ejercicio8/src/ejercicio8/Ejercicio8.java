/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        
        frase = leer.nextLine();
        int longitud=frase.length();
        if (longitud == 8){
            System.out.println("Correcto");
        }else{System.out.println("Incorrecto");
        
    }
    
}


