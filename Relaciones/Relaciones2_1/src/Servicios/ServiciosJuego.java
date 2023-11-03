/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class ServiciosJuego {

    ArrayList<Jugador> jugadores = new ArrayList();
    Scanner leer = new Scanner(System.in);
    RevolverDeAgua rev = new RevolverDeAgua();
    
    /**
     * Se inicia el juego cargando el revolver
     */
    public void InicioJuego() {
        rev.LlenarRevolver();
    }

    /**
     * Se crea la cantidad de participantes
     */
    public void cantidadJugadores() {
        System.out.println("La cantidad maxima de jugadores es 6, ¡Recuerda!");
        System.out.println("Ingrese el numero de jugadores");
        int num = leer.nextInt();
        leer.nextLine();
        if (num < 0 || num > 6) {
            num = 6;
        }
        for (int i = 0; i < num; i++) {
            Jugador ju = new Jugador();
            ju.setId(i);
            ju.setJugador("Jugador ");
            System.out.println(ju.getJugador());
            jugadores.add(ju);
        }
    }
/**
 * Se inicia la ronda de juego entre los participantes
 * @return si se moja 
 */
    public boolean ronda() {
        int cont = 0;
        while (cont < jugadores.size()) {
            Jugador jugador = jugadores.get(cont);
            if (jugador.disparo(rev)) {
                System.out.println(jugador.getJugador() + " caramba, te has mojado");
                return true;
            } else {
                System.out.println(jugador.getJugador() + " caramba, estas seco");
            }
            cont++;
        }
        return false;
    }

}
