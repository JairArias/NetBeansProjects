/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Rectangulos;

/**
 *
 * @author Ryzen
 */
public class RectangulosServicio {

    Scanner leer = new Scanner(System.in);
    Double superficie;
    Double perimetro;

    public Rectangulos CrearRectangulos() {
        Rectangulos r1 = new Rectangulos();

        System.out.println("Ingrese el valor de la base del rectangulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese el valor de la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        return r1;

    }

    public void superficieRectangulo(Rectangulos r1) {
        superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectangulo : " + superficie);
    }

    public void perimetroRectangulo(Rectangulos r1) {
        perimetro = (r1.getBase() + r1.getAltura() * 2);
        System.out.println("El perimetro del rectangulo : " + perimetro);
    }

    public void impresionRectangulo(Rectangulos r1) {
        for (int j = 0; j < r1.getAltura(); j++) {
            for (int i = 0; i < r1.getBase(); i++) {
                if (i == 0 || i == (r1.getBase() - 1) || j == 0 || j == (r1.getAltura() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
}
