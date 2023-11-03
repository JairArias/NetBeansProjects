/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra14;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N;
        int M;
        int E;
        int prom=0;
        int sumaE=0;
        int cont=0;
        System.out.println("Ingrese la cantidad de Familias");
        N=leer.nextInt();
        int familia[]=new int[N];
        
  
        for(int i=0;i<N;i++){
            
            System.out.println("Ingrese la cantidad de hijos por familia");
            M=leer.nextInt();
            int hijos[]=new int[M];
            
          for (int j=0;j<M;j++){
            System.out.println("Ingrese las edades de los hijos por familia");
            E=leer.nextInt();
            hijos[j]=E;
            cont+=1;
            sumaE+=E;
        }
            }
        prom=sumaE/cont;
        System.out.println("El promedio de las edades de todos los hijos es :"+prom);
       
        
    }
    
}
