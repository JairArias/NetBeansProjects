/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int numero, cont;
       int n = 5;
       cont = 0;
        int [] vector = new int [n];
       Random aleatorio = new Random();
        System.out.println("Ingrese el numero a buscar en el vector");
        numero = leer.nextInt();
              for (int i = 0; i<n; i++){
            vector[i] = aleatorio.nextInt(101);
            
           if (numero == vector[i]){
               System.out.println("El numero esta en la posicion "+i);
               
               cont += 1;
               System.out.println(cont);
           }
           
           if (cont > 1){
              System.out.println("El numero esta repetivo en el vector); 
           }
        }
              
    }
    
}
