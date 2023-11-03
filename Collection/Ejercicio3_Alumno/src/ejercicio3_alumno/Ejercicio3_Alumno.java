/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_alumno;

import Servicio.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Ejercicio3_Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opc;

        AlumnoServicio as = new AlumnoServicio();

        as.crearAlumno();

        System.out.println("Digite S si desea conocer la nota final de un alumno o N para salir");
        opc = leer.next();
        do {
            as.notafinal();
            System.out.println("Digite S si desea conocer la nota final de otro alumno o N para salir");
            opc = leer.next();
        } while (opc.equals("S"));

    }

}
