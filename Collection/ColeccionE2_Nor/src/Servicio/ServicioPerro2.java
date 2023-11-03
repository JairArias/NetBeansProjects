/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Perro2;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Ryzen
 */
public class ServicioPerro2 {

    private Scanner leer;
    private ArrayList<String> perro2;

    //constructor
    public ServicioPerro2() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perro2 = new ArrayList();
    }

    public void ingresarPerro2() {

        System.out.println("Ingrese la raza de un perro");
        String razaPerro = leer.next();

        perro2.add(razaPerro);
    }

    public void mostrarPerros2() {
        System.out.println("Las razas de perros ingresadas son:");
        for (String var : perro2) {
            System.out.println(var);
        }
        System.out.println("La cantidad de razas ingresadas son:" + perro2.size());
    }

    public void eliminarPerros2() {
        Iterator<String> it = perro2.iterator();
        String nuevoPerro;
        while (it.hasNext()) {
            String aux = it.next();
            System.out.println("Digite una raza de perro");
            nuevoPerro = leer.next();
            if (aux.equals(nuevoPerro)) {

                it.remove();
                System.out.println("Se elimino la raza de perro ingresada");

                break;
            } else {
                System.out.println("La raza ingresada no se encuentra en la lista");
                break;
            }

        }
        Collections.sort(perro2);
    }
}
