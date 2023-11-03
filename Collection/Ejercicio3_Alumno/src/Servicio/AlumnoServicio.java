/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Alumno;

/**
 *
 * @author Ryzen
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> lista = new ArrayList();

    public void crearAlumno() {
        boolean continuar = false;

        do {
            Alumno al = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            al.setNombre(leer.nextLine());
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota.");
                notas.add(leer.nextInt());
                leer.nextLine();
            }
            al.setNotas(notas);
            lista.add(al);

            System.out.println("¿Desea ingresar otro alumno? S/N");
            String opc;

            do {
                opc = leer.nextLine();
                if (opc.equals("S") || opc.equals("N")) {
                    continuar = opc.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta invalida. Ingrese S o N");
                }
            } while (opc.equalsIgnoreCase("S") && opc.equalsIgnoreCase("N"));
        } while (continuar);

    }

    public void notafinal() {
        int notaFinal = 0;
        String busAlumno;
        System.out.println("Ingrese el nombre del alumno");
        busAlumno = leer.nextLine();
        boolean estaEnLista = false;
        for (Alumno alumno : lista) {
            if (alumno.getNombre().equalsIgnoreCase(busAlumno)) {
                for (Integer nota1 : alumno.getNotas()) {
                    notaFinal += nota1;

                }
                estaEnLista = true;
                System.out.println("El promedio de las notas es: " + ((double) notaFinal / alumno.getNotas().size()));
                break;

            }
        }

        if (!estaEnLista) {
            System.out.println("El alumno ingresado no existe");
        }

    }

}
