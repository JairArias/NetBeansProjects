/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra18;
import java.util.Scanner;


/**
 *
 * @author Ryzen
 */
public class Extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N,suma;
        suma=0;
        System.out.println("Ingrese el tamaño del vector");
        N=leer.nextInt();
        int vector[]=new int [N];
        
        for(int i=0;i<N;i++){
            System.out.println("Ingrese un valor del vector");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los valores es: "+suma);
    }
    
}
