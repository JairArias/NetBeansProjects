/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        
        Random aleatorio = new Random();
        int i;
        int j;
        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                matriz[i][j]=aleatorio.nextInt(10);
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (j=0;j<4;j++){
            for (i=0;i<4;i++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
