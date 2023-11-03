/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String frase;
        String frase2;
        frase2 = "";
        System.out.println("Ingrese una frase y termine en .");
        frase = leer.nextLine();
         int longitud=frase.length();
           
      
      for (int i = 0; i < longitud; i++ ) {
        String letra =frase.substring(i,++i);
     
      i -= 1;
      
     switch (letra){
         case "a":
             frase2 = frase2.concat("@");
             break;
         case "e":
             frase2 = frase2.concat("#");
             break;
         case "i":
             frase2 = frase2.concat("$");
             break;
         case "o":
             frase2 = frase2.concat("%");
             break;
         case "u":
             frase2 = frase2.concat("*");
             break;
         default:
             frase2 += letra;
             break;
             
     }
      
     
    }

   System.out.print(frase2);
    
}
