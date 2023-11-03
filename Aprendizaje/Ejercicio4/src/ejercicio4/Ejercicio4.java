/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("Ingrese la temperatura en ° cent´grados");
        a = leer.nextInt();
        b = (a*9/5)+32;
        System.out.println("los grados Fahrenheit son: "+ b);
    }
    
}
