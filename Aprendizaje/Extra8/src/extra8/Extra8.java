/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, numero, numeroPar, numeroImp;
        n = 0;
        numeroPar = 0;
        numeroImp = 0;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();

        ejecutar(numero, n, numeroPar, numeroImp);

    }

    public static void ejecutar(int numero, int n, int numeroPar, int numeroImp) {
        Scanner leer = new Scanner(System.in);

        while ((numero % 5) != 0) {
            
            if (numero > 0){
                n += 1;
            
            if ((numero % 2) == 0) {
                numeroPar += 1;
            } else {
                numeroImp += 1;
            }
           
        }
             System.out.println("Ingrese un numero entero");
            numero = leer.nextInt();
}
        System.out.println("La cantidad de numeros leidos es: " + n);
        System.out.println("La cantidad de numeros pares es: " + numeroPar);
        System.out.println("La cantidad de numeros impares es: " + numeroImp);

    }
}
