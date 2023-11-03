/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import java.util.ArrayList;

/**
 *
 * @author Ryzen
 */
public class ServiciosCarta {

    ArrayList<Carta> cartas = new ArrayList();
    Carta c;

    //constructor 
    public void ListaCarta(Carta carta) {
        cartas.add(c);

    }

    public void Iniciar() {

        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) {
                //continue;
            } else {
                c = new Carta();
                c.setNumero(i);
                for (int j = 1; j <= 4; j++) {
                    switch (j) {
                        case 1:
                            c.setPalo("Copas");
                            break;
                        case 2:
                            c.setPalo("Bastos");
                            break;
                        case 3:
                            c.setPalo("Oros");
                            break;
                        case 4:
                            c.setPalo("Espadas");
                            break;
                    }
                    //cartas.add(c);
                    System.out.println(c.getPalo());
                    cartas.forEach((_item) -> {
                        System.out.println(cartas);
                    });

                }

            }

        }

    }

}
