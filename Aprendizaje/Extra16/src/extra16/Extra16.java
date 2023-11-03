/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra16;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N;
        //int M;

        System.out.println("Ingrese la cantidad de personas");
        N = leer.nextInt();
        String opc = "S";
        String nombre[] = new String[N];
        int edad[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el nombre");
            nombre[i] = leer.next();
            System.out.println("Ingrese la edad de la persona");
            edad[i] = leer.nextInt();
        }

        for (int i = 0; i < N; i++) {

            if (edad[i] > 18) {
                System.out.println(nombre[i] + " tiene " + edad[i] + " años y es mayor de edad");
            } else {
                System.out.println(nombre[i] + " tiene " + edad[i] + " años y es menor de edad");
            }
            if (i<N-1){
                 System.out.println("Para detener la impresion digite NO, para continuar S");
            opc = leer.next();
            }
            
            if (opc.equals("NO")){
                i=N;
            }
           
        }

    }

}
