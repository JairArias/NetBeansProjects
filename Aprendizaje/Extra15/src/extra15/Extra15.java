/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra15;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        // int suma, resta, div,mult;
        String opc;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Digite que operacion desea resolver");

        System.out.println("A- Suma");
        System.out.println("B- Resta");
        System.out.println("D- Division");
        System.out.println("C- Multiplicacion");
        opc = leer.next();

        switch (opc) {
            case "A":
                int retorno = sumar(num1, num2);
                System.out.println("La suma de los 2 numeros es: " + retorno);
                break;
            case "B":
                retorno = restar(num1, num2);
                System.out.println("La suma de los 2 numeros es: " + retorno);

                break;
            case "C":
                retorno = dividir(num1, num2);
                System.out.println("La suma de los 2 numeros es: " + retorno);
                break;
            case "D":
                retorno = multiplicar(num1, num2);
                System.out.println("La suma de los 2 numeros es: " + retorno);
                break;

        }

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;

    }

    public static int dividir(int num1, int num2) {
        int div;
        div = num1 / num2;
        return div;

    }

    public static int multiplicar(int num1, int num2) {
        int mult;
        mult = num1 * num2;
        return mult;

    }
}
