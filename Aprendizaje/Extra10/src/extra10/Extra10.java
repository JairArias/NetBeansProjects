/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryzen
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Random r =new Random();
        int a,b,c,d;
        a = (int)(r.nextDouble()*10);
         b = (int)(r.nextDouble()*10);
         System.out.println("Adivina la multiplicacion de 2 numeros entre 0 y 10");
         d=a*b;
         c=0;
         
         while(c!=d){
             
             System.out.println("Ingrese tu numero");
             c=leer.nextInt();
             
             if(c!=d){
                 System.out.println("Sigue intentando!");
             }
             
             
         }
         System.out.println("Encontraste el resultado, felicitaciones: "+c);
             
        
        
        
        
    }
    
}
