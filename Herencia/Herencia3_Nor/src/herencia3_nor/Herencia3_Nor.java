/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3_nor;

import Entidades.Televisor;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Herencia3_Nor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  Electrodomestico el = new Electrodomestico();
        List<Electrodomestico> lista = new ArrayList();
        

        Scanner leer = new Scanner(System.in);
        int opc;
        String opc2 = "S";
        Lavadora lv = new Lavadora();
        Televisor tv = new Televisor();

        do {
            System.out.println("Bienvenido al programa que te ayudara a pedir tu electrodomestico");
            System.out.println("Digite un numero");
            System.out.println("1- Crear una Lavadora");
            System.out.println("2- Crear un Televisor");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    lv.crearLavadora();
                    lv.precioFinal();
                    break;
                case 2:
                    tv.crearTelevisor();
                    tv.precioFinal();
                    break;

            }
            System.out.println("Digite S si desea seguir creando electrodomesticos, N para salir");
            opc2 = leer.next();
        } while (opc2.equalsIgnoreCase("s"));
    }
}
