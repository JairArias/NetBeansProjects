/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int cuadrado;
          System.out.println("Ingrese el tamaño del cuadrado");
             cuadrado= leer.nextInt();
             
             for (int i=0; i<cuadrado; i++){
              
                for (int j=0; j<cuadrado; j++){
                   if (i==0 || i==cuadrado-1 || j==0 || j==cuadrado-1){
                     System.out.print("*")
                   }else{
                       System.out.print(" ")
                       };
                                     
                } 
                System.out.println("");   
            }
              
    
}
