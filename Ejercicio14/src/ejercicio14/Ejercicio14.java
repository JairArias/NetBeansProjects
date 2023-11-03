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
        String [] equipo = new String[9];
        for (int i = 0; i < 9; i++){
            System.out.println("Ingrese el nombre de su compañero de equipo");
            equipo[i] = leer.next();
            
    
        
    }
        for (int i = 0; i < 9; i++){
            System.out.println(equipo[i]);
    } 
    
}
