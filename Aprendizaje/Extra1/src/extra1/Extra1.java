/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int min = 256;
        int dia;
        int hora;
        
        
        hora=(min/60);
         if (hora > 24){
            
            dia=hora/24;
            hora=hora%24;
            System.out.println("Los minutos en dias son "+dia+" y "+hora+" horas");
          
         }else{System.out.println("Los minutos en horas "+hora);
         
         }
        
        
        
        
        
    }
    
}
