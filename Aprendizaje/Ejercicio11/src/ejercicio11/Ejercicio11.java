/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int a,b,suma,resta,multiplicar;
        double dividir;
        System.out.println("Ingrese 2 numeros enteros");
        a = leer.nextInt();
        b = leer.nextInt();
        suma = 0;
        resta = 0;
        multiplicar = 0;
        dividir = 0;
        menuOperaciones(a,b,suma,resta,multiplicar,dividir);
  }
    
    public static void menuOperaciones (int a,int b,int suma,int resta,int multiplicar,double dividir){
        Scanner leer = new Scanner (System.in);
           
        int opc;
    
      
do  {
      System.out.println("1- Suma");
System.out.println("2- Resta");
System.out.println("3- Multiplicar");
System.out.println("4- Dividir");
System.out.println("5- Salir");
 System.out.println("Bienvenido al menu de operaciones, elija su opcion");
opc = leer.nextInt();

    
    
switch(opc){
    case 1:
        System.out.println(suma=a+b)
                break;
    case 2:
        System.out.println(resta = a-b)
                break;
    case 3:
        System.out.println(multiplicar = a*b)
                break;
    case 4:
        System.out.println(dividir = a/b)
                break;
    case 5:
        System.out.println("Salio del sistema")
}
}while(opc < 4);
        

    }
    
    

