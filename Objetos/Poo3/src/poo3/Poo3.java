/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import Servicio.OperacionServicio;

/**
 *
 * @author Ryzen
 */
public class Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionServicio os = new OperacionServicio();
        os.sumaOperacion();
        System.out.println("La suma de los numeros es: " + os.sumaOperacion());
        os.restaOperacion();
        System.out.println("La resta de los numeros es: " + os.restaOperacion());
        os.multiplicaOperacion();
        System.out.println("La multiplicacion de los numeros es: " + os.multiplicaOperacion());
        os.dividirOperacion();
        System.out.println("La division de los numeros es: " + os.dividirOperacion());
    }

}
