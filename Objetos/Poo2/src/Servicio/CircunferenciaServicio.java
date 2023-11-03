/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Circunferencia;

/**
 *
 * @author Ryzen
 */
public class CircunferenciaServicio {

    private final Scanner leer = new Scanner(System.in);
    private Circunferencia objeto;

//constructor
    public CircunferenciaServicio() {
        objeto = crearCircunferencia();
    }

    private Circunferencia crearCircunferencia() {
        objeto = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        objeto.setRadio(leer.nextDouble());
        return objeto;
    }

    public void areaCircunferencia() {
        Double area;
        area = (Math.PI * Math.pow(objeto.getRadio(), 2));
        System.out.println("El area de la circunferencia es: " + area);
    }

    public void perimetroCircunferencia() {
        Double perimetro;
        perimetro = (2 * Math.PI * objeto.getRadio());
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
}
