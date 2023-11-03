/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
                if (num1 > 25 && num2 > 25){
        System.out.println("Los 2 numeros ingresados son mayores a 25");
    }else if ( num2 > 25){
        System.out.println("El numero " + num2 + " es mayor a 25");
    }else if (num1 > 25){
                    System.out.println("El numero " + num1 + " es mayor a 25");
    }else {System.out.println("Ningun numero ingresado es mayor a 25");
            }
      
    }
        
        // TODO code application logic here
    }
    
}
