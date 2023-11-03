/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra9;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dividiendo, divisor,n,residuo;
        dividiendo=120;
        divisor=7;
        n=0;
        
        do{
            n+=1;
            residuo=dividiendo-divisor;
            dividiendo=residuo;
            
        }while(residuo >= divisor );
        System.out.println("El residuo  es "+residuo+" y el coeficiente es "+n);
        
    }
    
}
