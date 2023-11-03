/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        char letra;
        double costo;
        double pago;

        System.out.println("Ingrese la letra que lo acredita como socio");
        letra = leer.next().charAt(0);
        letra = Character.toUpperCase(letra);

        switch (letra) 
            ;
            case ('A'):
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextInt();
                pago = costo * .50;
                System.out.println("El valor a cancelar es: " + pago);
                break;
            case ('B'):
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextInt();
                pago = costo - (costo * .35);
                System.out.println("El valor a cancelar es: " + pago);
                break;
            case ('C'):
                System.out.println("Ingrese el costo del tratamiento");
                costo = leer.nextInt();
                pago = costo;
                System.out.println("El valor a cancelar es: " + pago);
                break;
            default:
                System.out.println("La opcion ingresada no es valida");

        }

    }
