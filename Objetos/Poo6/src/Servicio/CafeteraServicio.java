/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();

    public Cafetera LlenarCafetera() {
        c1.setCapacidadMaxima(1000);
        c1.setCapacidadActual(c1.getCapacidadMaxima());
        System.out.println("¡Cafetera llena!");
        return c1;
    }

    public Cafetera ServirTaza() {

        System.out.println("Ingrese el tamaño de la taza de cafe que desea comprar");
        System.out.println("1- 140ml");
        System.out.println("2- 240ml");
        System.out.println("3- 60ml Espresso");
        c1.setTazaCafe(leer.nextInt());
        switch (c1.getTazaCafe()) {
            case 1:
                c1.setTazaCafe(140);
                break;
            case 2:
                c1.setTazaCafe(240);
                break;
            case 3:
                c1.setTazaCafe(60);
                break;
            default:
        }
        if (c1.getCapacidadActual() >= c1.getTazaCafe()) {
            c1.setCapacidadActual(c1.getCapacidadActual() - c1.getTazaCafe());
            System.out.println("Su taza de cafe esta servida, que la disfrute!");

        } else {
            c1.setTazaCafe(c1.getCapacidadActual());
            System.out.println("Su taza de cafe se sirvio con " + c1.getTazaCafe() + "ml, no se alcanzo a llenar el vaso ");
            c1.setCapacidadActual(0);
        }
        return c1;
    }

    public Cafetera VaciarCafetera() {
        c1.setCapacidadActual(0);
        System.out.println("¡Cafetera vacia!");
        return c1;
    }

    public Cafetera AgregarCafe() {
        System.out.println("Ingrese la cantidad de cafe agregar");
        c1.setCafe(leer.nextInt());

        if (c1.getCapacidadActual() + c1.getCafe() <= c1.getCapacidadMaxima()) {
            c1.setCapacidadActual(c1.getCapacidadActual() + c1.getCafe());
            System.out.println("Se agrego la cantidad de cafe exitosamente");
        } else {
            System.out.println("La cantidad agregar sobrepasa el tamaño maximo de la cafetera");
            System.out.println("Puede agregar una cantidad maxima de " + (c1.getCapacidadMaxima() - c1.getCapacidadActual()) + "ml a la cafetera");
        }
        return c1;

    }
}
