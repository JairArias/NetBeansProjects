/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_paises;

import Servicios.PaisesServicios;


/**
 *
 * @author Ryzen
 */
public class Ejercicio5_Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisesServicios ps = new PaisesServicios();
        System.out.println("Bienvenido a su sistema de Paises");
        

        ps.guardarPais();
        ps.ordenarPaises();
        ps.buscarPais();
    }

}
