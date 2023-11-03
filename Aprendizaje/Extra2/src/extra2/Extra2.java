/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A,B,C,D;
        A=5;
        B=56;
        C=14;
        D=3;
        int E=0;
        
        System.out.println("Los valores son: A = "+A+" B = "+B+" C = "+C+" D = "+D);
        E=B;
        B=C;
        C=A;
        A=D;
        D=E;
        System.out.println("Los nuevos valores son: A = "+A+" B = "+B+" C = "+C+" D = "+D);
        
    }
    
}
