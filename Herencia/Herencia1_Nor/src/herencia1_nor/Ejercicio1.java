/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1_nor;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Ryzen
 */
public class Ejercicio1 {
    
    public static void main(String[] args){
       
    //Declaracion de dos objetos Perros
    Animal perro1 = new Perro("Stich","Carne",15,"Doberman");
    perro1.Alimentarse();
    Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
    perro2.Alimentarse();
    //Declaracion del objeto Gato
    Animal gato1 = new Gato("Pelusa","Galletas",15,"Siames");
    gato1.Alimentarse();
    //Declaracion del objeto Caballo
    Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
    caballo1.Alimentarse();
    

    }
}
