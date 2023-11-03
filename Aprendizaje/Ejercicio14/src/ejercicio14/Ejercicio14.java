/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dinero;
        int tipo;
        System.out.println("Ingrese la cantidad de dinero");
        dinero=leer.nextInt();
        System.out.println("Ingrese la moneda a convertir");
        System.out.println("1- Dolares");
        System.out.println("2- Yenes");
        System.out.println("3- Libras");
        tipo=leer.nextInt();
        
        double resultado2= convertir(dinero,tipo);
       System.out.println(resultado2);
     
        
        
    }
    
    public static double convertir(int dinero1,int tipo1) {
        double resultado = 0;
        switch(tipo1){
            case 1:
                resultado= dinero1*1.28611
                        break;
            case 2:
                resultado= dinero1*129.852
                        break;
            case 3:
                resultado= dinero1*0.86
                        break;
        }
        return resultado;
       
    }
}
