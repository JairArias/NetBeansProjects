/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        double d;
        System.out.println("Ingrese un numero entero");
                a = leer.nextInt();
                b = a*2;
                c = a*3;
                d = Math.sqrt(a);
                System.out.println("El doble del numero ingresado es: "+ b);
                System.out.println("El triple del numero ingresado es: "+ c);
                System.out.println("La raiz cuadrada del numero ingresado es: "+ d);
                
                
                
        
    }
    
}
