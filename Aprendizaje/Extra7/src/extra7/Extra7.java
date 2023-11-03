/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra7;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n = 0;
        int numero;
        int numeroMin = 10000;
        int numeroMax = 0;
        double promedio = 0;

        System.out.println("Ingrese un valor");
        numero = leer.nextInt();

        //opcion1(n, numeroMin, numeroMax, promedio, numero);
        opcion2(n,numeroMin,numeroMax,promedio,numero);
    }

    public static void opcion1(int n, int numeroMin, int numeroMax, double promedio, int numero) {
        Scanner leer = new Scanner(System.in);

        while (numero > 0) {
            n += 1;
            promedio += numero;
            if (numeroMin > numero) {
                numeroMin = numero;
            }
            if (numeroMax < numero) {
                numeroMax = numero;
            }
            System.out.println("Ingrese un valor");
            numero = leer.nextInt();

        }
        if (n == 0) {
            System.out.println("No se ingresaron numeros mayores de 0");
        } else {
            System.out.println("El valor minimo ingresado es: " + numeroMin);
            System.out.println("El valor maximo ingresado es: " + numeroMax);
            promedio = promedio / n;
            System.out.println("El promedio de los numeros ingresados es: " + promedio);

        }

    }

    public static void opcion2(int n, int numeroMin, int numeroMax, double promedio, int numero) {
        Scanner leer = new Scanner(System.in);
        if (numero >0){
            do {
            n += 1;
            promedio += numero;
            if (numeroMin > numero) {
                numeroMin = numero;
            }
            if (numeroMax < numero) {
                numeroMax = numero;
            }
            System.out.println("Ingrese un valor");
            numero = leer.nextInt();

        } while (numero > 0);

        System.out.println("El valor minimo ingresado es: " + numeroMin);
        System.out.println("El valor maximo ingresado es: " + numeroMax);
        promedio = promedio / n;
        System.out.println("El promedio de los numeros ingresados es: " + promedio);

    }else{
        System.out.println("No se ingresaron numeros mayores de 0")}
        
}
