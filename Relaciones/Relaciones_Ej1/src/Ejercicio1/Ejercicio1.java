/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Ryzen
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

   
        Perro pr = new Perro("Tor", "Bulldog", 2, 45);
        Perro pr2 = new Perro("Kamba", "Pastor Aleman", 4, 56);

        Persona pe = new Persona("Jorge Enrique", "Gomez Contreras", 42, 1235483, pr);
        Persona pe2 = new Persona("Carlos", "Tulio Mora", 63, 52806489, pr2);
        

        System.out.println("Nombre y Apellido dueño: " + pe.getNombre() + " " + pe.getApellido() + ", edad dueño: " + pe.getEdad() + ", documento dueño: " + pe.getDocumento() + ";\n Nombre perro: " + pr.getNombre() + ", raza perro: " + pr.getRaza() + ", edad perro: " + pr.getEdad() + ", tamaño perro: " + pr.getTamano());
        System.out.println("\n");
        System.out.println("Nombre y Apellido dueño: " + pe2.getNombre() + " " + pe2.getApellido() + ", edad dueño: " + pe2.getEdad() + ", documento dueño: " + pe2.getDocumento() + ";\n Nombre perro: " + pr2.getNombre() + ", raza perro: " + pr2.getRaza() + ", edad perro: " + pr2.getEdad() + ", tamaño perro: " + pr2.getTamano());

    }

}
