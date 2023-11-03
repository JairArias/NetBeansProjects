/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Perro;
import java.util.ArrayList;
        
/**
 *
 * @author Ryzen
 */

public class ServicioPerro {
    
    private Scanner leer ;
    private ArrayList<String> perro;
    
    //constructor
    public ServicioPerro (){
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.perro = new ArrayList(); 
        }
    
    public void ingresarPerro (){
        
        System.out.println("Ingrese la raza de un perro");
        String razaPerro = leer.next();
        
        perro.add(razaPerro);
    }
    
    public void mostrarPerros(){
        System.out.println("Las razas de perros ingresadas son:");
        for (String var : perro) {
            System.out.println(var);
        }
        System.out.println("La cantidad de razas ingresadas son:"+perro.size());
    }
}
