/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       //String formato;
        String cadena;
        String FDE;
        FDE = "&&&&&";
      
        
        int correcto = 0;
        int incorrecto = 0;
        
        cadena = "ooooo";
  
        
         do {
             System.out.println("Ingrese cadena a leer");
             cadena = leer.nextLine();
              int tamano=cadena.length();
             
            
        if (tamano<=5){
            if (cadena.substring(0,1).equals("X") && cadena.substring(tamano-1,tamano).equals("O")){
                correcto += 1;
                
           }else {incorrecto += 1;
                
            }
            
        }else {incorrecto += 1;
        
        }         
            
    
        }while (!cadena.equals(FDE));
                 
      System.out.println("Se obtuvieron "+ correcto +" formatos correctos");  
      System.out.println("Se obtuvieron "+ incorrecto +" formatos incorrectos");
    }
    
}
