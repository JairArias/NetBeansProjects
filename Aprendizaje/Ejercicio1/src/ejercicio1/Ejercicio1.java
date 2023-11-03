/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 numero enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3;
        num3=num1+num2;
        System.out.println("la suma de los 2 numeros es " +num3);
    }
    
}
