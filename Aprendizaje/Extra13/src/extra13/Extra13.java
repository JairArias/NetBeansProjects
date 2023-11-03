/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra13;
import java.util.Scanner;


/**
 *
 * @author Ryzen
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero para la escalera");
        numero=leer.nextInt();
        
        for (int i=1;i<=numero;i++){
            
        
            for (int j=1;j<=i;j++){
              System.out.print(j);  
            }
             System.out.println("");
            
            }
    }
    
}
