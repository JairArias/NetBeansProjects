/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author Ryzen
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    Persona pe = new Persona();

    /**
     * Se crea la persona
     *
     * @return se devuelve la persona creada
     */
    public Persona CrearPersona(Persona pe) {
        System.out.print("Ingrese nombres y apellidos: ");
        pe.setNombre(leer.nextLine());
        System.out.print("Ingrese su edad: ");
        pe.setEdad(leer.nextInt());

        System.out.print("Ingrese su sexo:\nH- Hombre.\nM- Mujer.\nO- Otro\n");
        pe.setSexo(leer.next());
        leer.nextLine();
        switch (pe.getSexo()) {
            case "H":
                pe.setSexo("Hombre");
                break;
            case "M":
                pe.setSexo("Mujer");
                break;
            case "O":
                pe.setSexo("Otro");
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta");
        }
        System.out.print("Ingrese su peso en kilogramos: ");
        pe.setPeso(leer.nextDouble());
        leer.nextLine();
        System.out.print("Ingrese su estatura en Mts: ");
        pe.setAltura(leer.nextDouble());
        leer.nextLine();
        return pe;
    }

    /**
     * Informa si esta en el peso ideal
     *
     * @param pe
     */
    public void CalcularImc(Persona pe) {
        //PersonaServicio ps = new PersonaServicio();
        pe.setsImc((int) (pe.getPeso() / (pe.getAltura() * 2)));
        if (pe.getsImc() < 20) {
            pe.setsImc(-1);
        } else if (pe.getsImc() > 19 & pe.getsImc() < 26) {
            pe.setsImc(0);
        } else {
            pe.setsImc(1);
        }
    }

    /**
     * Informa si la persona es mayor de 18 años
     *
     * @param pe
     */
    public void mayorEdad(Persona pe) {
        if (pe.getEdad() >= 18) {

            System.out.println("La persona es mayor de edad : " + true);
        } else {
            System.out.println("La persona es mayor de edad : " + false);
        }

    }
}
