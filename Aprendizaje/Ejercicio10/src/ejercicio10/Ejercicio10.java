/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int numLim,num,suma;
    System.out.println("Ingrese un valor limite positivo");
    numLim = leer.nextInt();
    suma = 0;
    
    do{
         System.out.println("Ingrese un valor");
         num = leer.nextInt();
         suma+= num;
        
    }while (suma < numLim);
    System.out.println(suma);
        
          
    }
    
}
