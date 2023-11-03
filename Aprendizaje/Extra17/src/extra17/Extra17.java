/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra17;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero;
        
        System.out.println("ingrese un numero");
        numero=leer.nextInt();
        //boolean resultado;
       boolean resultado=esPrimo(numero);
        System.out.println("El numero ingresado es primo: "+resultado);
    }
    
    public static boolean esPrimo(int numero){
        boolean operacion=false;
        
        if(numero%numero==0 && numero%1==0){
            
            operacion=true;
            if(numero%4==0 || numero%3==0 ){
                operacion=false;
            }
           }
        return operacion;
        
    }
    
    
}
