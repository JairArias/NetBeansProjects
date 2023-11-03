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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);
        int suma;
        int contador;
        suma = 0;
        contador = 0;
        int num;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
             contador += 1;
             if (num > 0) {
                suma += num;
             }
        
        } while (contador <= 20 && num != 0);
    
        
    System.out.println(suma);
}

        