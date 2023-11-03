/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int numero;
        int sumaPar;
        int suma;
        boolean filas;
        boolean columnas;
        boolean diag1;
        boolean diag2;
        boolean resultado;

            
                
                    for (int i =0;i<3;i++){
                        for (int j=0;j<3;j++){
                System.out.println("Ingrese un numero del 1 al 9 para formar la matriz"); 
                numero = leer.nextInt();
                    if (numero > 0 && numero < 10){        
                        matriz[i][j]=numero;
                }else{System.out.println("Valor errado");
                    }
                    
                        }
                    }
    //suma Filas
    suma = 0;
    filas = true;
    for (int i =0;i<3;i++){
        sumaPar=0;
        for (int j=0;j<3;j++){
            if (i == 0){
                 suma+=matriz[i][j];
            }else{sumaPar+=matriz[i][j];
            }
        }
        if (i!=0 && suma !=sumaPar){
            filas=false;
        }   
            
    }
    


     //suma Columnas
    columnas = true;
    for (int i =0;i<3;i++){
        sumaPar=0;
        for (int j=0;j<3;j++){
                 sumaPar+=matriz[j][j];
            }
        if (suma !=sumaPar){
            columnas=false;
        } 
             
    }
     
        //suma diagonal
   sumaPar=0;
    diag1=true;
    for(int i=0;i<3;i++){
        sumaPar+=matriz[i][i];
    }     
    if (suma!=sumaPar){
        diag1=false;
    }
    
    //diagonal 2
    sumaPar=0;
    diag2=true;
    int j=3-1;
    for(int i=0;i<3;i++){
        sumaPar+=matriz[i][j];
        j-=1;
    }
    if (sumaPar !=suma){
        diag2=false;
    }
    
    if (filas && columnas && diag1 && diag2){
        resultado = true;
    }else {resultado=false;
    }
    System.out.println("La matriz es magica? "+resultado);
}
}