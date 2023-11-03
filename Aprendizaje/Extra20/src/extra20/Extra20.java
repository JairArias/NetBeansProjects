/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra20;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryzen
 */
public class Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int vector[];
        
        vector = llenar(10);
        imprimirVector(vector);

    }

    public static int [] llenar(int a) {
        int vector[] = new int[a];
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            vector[i] = (int) (r.nextDouble() * 20);
            
        }
       return vector;
    }

    public static void imprimirVector(int [] numero) {
        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i]+",");
        }
    }
}
