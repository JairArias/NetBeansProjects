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
public class Lavadora extends Electrodomestico {

    //Electrodomestico elec = new Electrodomestico();
    protected Integer carga;

//contructor
    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, String consumoenergetico, Integer peso) {
        super(precio, color, consumoenergetico, peso);
        this.carga = carga;
    }

//gett & sett
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    /**
     * Se crea una lavadora
     */
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();

        System.out.println("Ingresa el valor de la carga");
        System.out.println("Mayor a 30kg; tiene costo adicional $500");
        setCarga(leer.nextInt());
        leer.nextLine();
    }

    @Override
    public Double precioFinal() {
        Double precioFinaLavadora = super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (getCarga() > 30) {
            precioFinaLavadora += 500;
        }
        System.out.println("El valor a cancelar de su Lavadora es: "+precioFinaLavadora);
        
        return precioFinaLavadora;
    }

}
