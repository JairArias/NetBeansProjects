/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2_1;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import Servicios.ServiciosJuego;

/**
 *
 * @author Ryzen
 */
public class Relaciones2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServiciosJuego sju = new ServiciosJuego();
        System.out.println("Bienvenido al Juego del Revolver de Agua!!!");
        System.out.println("Estas listo, empecemos!!!");
        sju.InicioJuego();
        sju.cantidadJugadores();
        sju.ronda();
           }

}
