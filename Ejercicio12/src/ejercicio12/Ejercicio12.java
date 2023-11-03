
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio12;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        num2 = leer.nextInt();
        
        imprimirE(num1,num2);
        
                
    }
    
    public static void imprimirE (int num1, int num2){
   
         if (num2 % num1 == 0){
           System.out.println("El numero 1 es multiplo del numero 2");
           
        }else {System.out.println("El numero 1 no es multiplo del numero 2");
            }
    
    }



