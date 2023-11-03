/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Entidades.Juego;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ArrayList<Jugador> jugadores = new ArrayList();
    Scanner entrada = new Scanner(System.in);
    System.out.println("Bienvenido al Juego del Revolver de Agua!!!");
    System.out.println("La cantidad maxima de jugadores es 6, ¡Recuerda!");
    System.out.println("Ingrese el numero de jugadores:");
    int num = entrada.nextInt();
    if (num < 0 || num > 6) {
      num = 6;
    }
    for (int i = 1; i <= num; i++) {
      jugadores.add(new Jugador(i, "Jugador " + i));
    }
    Juego juego = new Juego(jugadores);
    System.out.println("==============================================");
    System.out.println(juego.toString());
    System.out.println("==============================================");
    System.out.println("****** JUEGO INICIADO ******");
    System.out.println("==============================================");
    for (int i = 1; i <= 6; i++) {
      System.out.println("RONDA/DISPARO #" + i);
      System.out.println("----------------------------------------------");
      if (juego.ronda()) { //Si jugaror mojado
        System.out.println("----------------------------------------------");
        break;
      }
      System.out.println("----------------------------------------------");
    }
    System.out.println("****** JUEGO FINALIZADO ******");

  }
}
