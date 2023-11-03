/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Electrodomestico {

    enum Colores {
        Blanco, Negro, Rojo, Azul, Gris
    }

    enum Consumoenergetico {
        A, B, C, D, E, F
    }

    protected Double precio;
    protected String color;
    protected String consumoenergetico;
    protected Integer peso;

    //constructor
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoenergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

// gett & sett
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(String consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /**
     * comprobar que la letra ingresada es de la A-F
     */
    public void comprobarConsumoEnergetico(char letra) {
        boolean letraElectrodomestico = false;
        for (Consumoenergetico i : Consumoenergetico.values()) {
            if (i.toString().equalsIgnoreCase(Character.toString(letra))) {
                letraElectrodomestico = true;
                break;
            }

        }
        if (!letraElectrodomestico) {
            setConsumoenergetico(Consumoenergetico.F.toString());
            System.out.println("La referencia no es correcta, se asigna la referencia F por defecto");
        } else {
            System.out.println("Se asigna la referencia " + getConsumoenergetico());
        }

    }

    /**
     * Asignar un color para el electrodomestico
     *
     * @param color
     */
    public void comprobarColor(String color) {

        boolean colorElectrodomestico = false;
        for (Colores i : Colores.values()) {
            if (i.toString().equalsIgnoreCase(color)) {
                colorElectrodomestico = true;
                break;
            }
        }
        if (!colorElectrodomestico) {
            setColor(Colores.Blanco.toString());
            System.out.println("El color no esta disponible, se asigna el color Blanco");
        } else {
            System.out.println("Se asigna el color " + getColor());
        }
    }

    /**
     * Se slicita la creacion del electrodomestico al usuario
     */
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        setPrecio(1000d);
        System.out.println("Elige el color disponible :");
        System.out.println("Blanco, Negro, Rojo, Azul y Gris");
        String colorUsuario = leer.nextLine();
        setColor(colorUsuario);
        comprobarColor(colorUsuario);
        System.out.println("Elige el consumo, ingresa la letra!");
        System.out.println("A- $ 1000");
        System.out.println("B- $ 800");
        System.out.println("C- $ 600");
        System.out.println("D- $ 500");
        System.out.println("E- $ 300");
        System.out.println("F- $ 100");
        String consumoE = leer.nextLine();
        setConsumoenergetico(consumoE);
        comprobarConsumoEnergetico(consumoE.charAt(0));
        System.out.println("Ingresa el peso");
        System.out.println("Entre 1 y 19 kg; precio $100");
        System.out.println("Entre 20 y 49 kg; precio $500");
        System.out.println("Entre 50 y 79 kg; precio $800");
        System.out.println("Mayor que 80 kg; precio $1000");
        setPeso(leer.nextInt());
        leer.nextLine();
    }

    /**
     * Se define el precio final que cancela el cliente
     */
    public Double precioFinal() {

        Double pp;
        if (getPeso() >= 80) {
            pp = 1000d;
        } else if (getPeso() > 49) {
            pp = 800d;
        } else if (getPeso() > 19) {
            pp = 500d;
        } else {
            pp = 100d;
        }
        //precioconsumo
        if (getConsumoenergetico().equalsIgnoreCase("A")) {
            pp += 1000;
        } else if (getConsumoenergetico().equalsIgnoreCase("B")) {
            pp += 800;
        } else if (getConsumoenergetico().equalsIgnoreCase("C")) {
            pp += 600;
        } else if (getConsumoenergetico().equalsIgnoreCase("D")) {
            pp += 500;
        } else if (getConsumoenergetico().equalsIgnoreCase("E")) {
            pp += 300;
        } else {
            pp += 100;
        }
        pp += precio;
        return pp;

    }
}
