/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import Servicio.PersonaServicio;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Poo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Persona pe = new Persona();
        int contMaE = 0;
        int contMeE = 0;
        int contPorD = 0;
        int contPorE = 0;
        int contPorN = 0;

        PersonaServicio ps2 = new PersonaServicio();
        PersonaServicio ps3 = new PersonaServicio();
        PersonaServicio ps4 = new PersonaServicio();
        for (int i = 0; i < 4; i++) {
            PersonaServicio ps1 = new PersonaServicio();

            ps1.CrearPersona(pe);
            ps1.CalcularImc(pe);
            ps1.mayorEdad(pe);
            if (pe.getEdad() > 17) {
                contMaE += 1;
            } else if (pe.getEdad() < 18) {
                contMeE += 1;
            }
            if (pe.getsImc() == -1) {
                contPorD += 1;
            } else if (pe.getsImc() == 1) {
                contPorE += 1;
            } else if (pe.getsImc() == 0){
                contPorN += 1;
            }

        }
        System.out.println(contPorD + " personas estan por debajo de su peso");
        System.out.println(contPorE + " personas estan por encima de su peso");
        System.out.println(contPorN + " personas estan con su peso normal");
        System.out.println("El " + (contMaE * 100) / 4 + " % son mayores de edad");
        System.out.println("El " + (contMeE * 100) / 4 + " % son menores de edad");

    }

}
