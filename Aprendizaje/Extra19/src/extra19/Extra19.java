/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra19;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryzen
 */
public class Extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int N;

        System.out.println("Ingrese el tamaño de los vectores");
        N = leer.nextInt();
        int vectorA[] = new int[N];
        int vectorB[] = new int[N];

        for (int i=0;i<N;i++){
            vectorA[i]=(int)(r.nextDouble()*10);
            vectorB[i]=(int)(r.nextDouble()*10);
            
        }
        
         for (int i=0;i<N;i++){
             if (vectorA[i]!=vectorB[i]){
                 i=N;
             }else{System.out.println("Los vector A y B son iguales");
         }
    }
         System.out.println("Los vectores son diferentes");

}
