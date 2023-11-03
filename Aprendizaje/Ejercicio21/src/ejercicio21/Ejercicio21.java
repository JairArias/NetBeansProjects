/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    int [][] matrizM =new int [10][10];
    int [][] matrizP = new int [3][3];
    Random aleatoreo = new Random();
    int a = 0;
    int b=0;
    int c =0;
    int cont = 0;
    
    
    for (int i=0;i<10;i++){
        for (int j=0;j<10;j++){
        matrizM[i][j]=aleatoreo.nextInt(10);
        System.out.print(matrizM[i][j]+"-");
        }
        System.out.println("");
    }
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            matrizP[i][j]=5;
            System.out.print(matrizP[i][j]+"-");
            
        }
        System.out.println("");
       
    }
    for (int i=0;i<10;i++){
        for (int j=0;j<10;j++){
            if(matrizP[a][b]==matrizM[i][j]){
                cont+=1;
                c=j;
                for (b=1;b<3;b++){
                     j+=1;
                    if (matrizP[a][b]==matrizM[i][j]){
                        cont+=1;
                        if (cont==3){
                            for (i+=1;i<2+i;i++){
                            for (c+=1;c<2+c;c++){
                            
                        }
                        }
                    }
                }
                
                System.out.println(i+","+j);
                //System.out.print(matrizP[a][b]);
                 //System.out.print(matrizM[0][2]);
                
            }
        }
        
    }
    }
    
    
}
