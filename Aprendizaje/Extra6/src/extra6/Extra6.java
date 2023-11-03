/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n,i,j,a;
        j=0;
        a=0;
        double estatura,promedio,suma,sumaG,promedioF;
        suma=0;
        sumaG=0;
        
        System.out.println("Ingrese la cantidad de personas");
        n=leer.nextInt();
        for (i=0;i<n;i++){
           System.out.println("Ingrese la estatura en Metros");
           estatura=leer.nextDouble();
        if(estatura < 1.60){
            suma+=estatura;
            j+=1;
        }else{
            sumaG+=estatura;
            //a+=1;
        }
        }
        promedio=suma/j;
        promedioF=(sumaG+suma)/n;
        System.out.println("El promedio de "+j+" personas que median menos que 1.60 mts es : "+promedio);
        System.out.println("El promedio total de "+n+" personas es : "+promedioF);
        
    }
    
}
