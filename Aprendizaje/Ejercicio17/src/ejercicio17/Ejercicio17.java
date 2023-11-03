/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author Ryzen
 */
import java.util.Random;
import java.util.Scanner;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int n = 50;
        int cont;
        int resultado;
        int div;
        int a,b,c,d,e;
        int [] vector = new int [n];
        
        
        div = 10;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        cont = 0;
        
            
        for (int i=0; i<n; i++){
             vector[i] = aleatorio.nextInt(15150);
            //System.out.println(vector[i]);
        }
        for (int i=0; i<n; i++){
            cont = 0;
            div = 10;
            //System.out.println(cont);
           // System.out.println(vector[i]);
            //resultado = 0;
           
            do{
            resultado=vector[i]/div;
            //System.out.println(resultado);
            cont+=1;
            div = div*10;
            }while (resultado >=1);
            
        resultado = cont;
        //System.out.println(resultado);
        
       // System.out.println(cont);
       switch (cont){
           case 1:
               a +=1;
               break;
           case 2:
               b +=1;
               break;
           case 3:
               c +=1;
               break;
           case 4:
               d +=1;
               break;
           case 5:
               e +=1;
               break;
               
       }
       
       }
       System.out.println("Los numeros ingresados que tienen un digito son: "+ a);
       System.out.println("Los numeros ingresados que tienen dos digitos son: "+ b);
       System.out.println("Los numeros ingresados que tienen tres digitos son: "+ c);
       System.out.println("Los numeros ingresados que tienen cuatro digitos son: "+ d);
       System.out.println("Los numeros ingresados que tienen cinco digitos son: "+ e);
               
           
    }
    
}
