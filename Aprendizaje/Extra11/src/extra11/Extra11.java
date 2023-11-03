/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra11;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int r = 10;
        int cont = 0;
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        while (r != 0) {
            cont += 1;
            r = numero / 10;
            numero = r;

        }
        System.out.println("El numero ingresado tiene "+cont+" digitos");
    }

}
