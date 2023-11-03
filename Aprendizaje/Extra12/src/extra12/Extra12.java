/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;
import java.util.Scanner;
/**
 *
 * @author Ryzen
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int numero;
        int matriz [][] = new int [10][3];
        String matrizB [][]=new String [10][3];
        
        //llenar
        for (int j=2;j>=0;j--){
            for (int i=0;i<10;i++){
                matriz[i][j]=i;
                
            }
            
        }
        //Cambiar a String
        
        for (int i=0;i<10;i++){
            for (int j=0;j<3;j++){
             
                
                if(matriz[i][j]==3){
                    matrizB[i][j]= "E";
                  
                }else{
                    matrizB[i][j]=Integer.toString(matriz[i][j]);
                }
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
            
        }
        
    }

    
    
}
