/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre 1 y 10");
        num = leer.nextInt();
        
        if (num > 0 && num < 11){
            switch(num) {
                case 1:
                    System.out.println("El numero en romano es: I");
                    break;
                      case 2:
                    System.out.println("El numero en romano es: II");
                    break;
                      case 3:
                    System.out.println("El numero en romano es: III");
                    break;
                      case 4:
                    System.out.println("El numero en romano es: IV");
                    break;
                      case 5:
                    System.out.println("El numero en romano es: V");
                    break;
                      case 6:
                    System.out.println("El numero en romano es: VI");
                    break;
                      case 7:
                    System.out.println("El numero en romano es: VII");
                    break;
                      case 8:
                    System.out.println("El numero en romano es: VIII");
                    break;
                      case 9:
                    System.out.println("El numero en romano es: IX");
                    break;
                      case 10:
                    System.out.println("El numero en romano es: X");
                    break;
            }
        }
    }
    
}
