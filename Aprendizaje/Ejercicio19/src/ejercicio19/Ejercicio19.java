/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] matrizAt = new int [3][3];
        
        Random aleatorio = new Random();
        int i;
        int j;
        int cor = 0;
        int inc = 0;
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                matriz[i][j]=aleatorio.nextInt(10);
               matrizAt[i][j]=matriz[i][j];
               System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    
       
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                           
                if (matriz[i][j]==matrizAt[j][i]){
                    cor+=1; 
                }else{inc +=1;
              
            }
           
        }
      
      
      }  
        
      if (cor==9){
          System.out.println("La matriz es anti simetrica");
      }else{System.out.println("La matriz no es anti simetrica");  
    }
    }
    
}
