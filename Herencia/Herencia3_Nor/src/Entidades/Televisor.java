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
public class Televisor extends Electrodomestico {

    protected Double pulgadas;
    protected boolean tdt;

//constructor
    public Televisor() {
    }

    public Televisor(Double pulgadas, boolean tdt, Double precio, String color, String consumoenergetico, Integer peso) {
        super(precio, color, consumoenergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    //gett & sett
    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Ingrese el tamaño de las pulgadas");
        System.out.println("Los televisores superiores a 40 pulgadas tienen un incremento del 30%");
        setPulgadas(leer.nextDouble());
        leer.nextLine();
        System.out.println("Desea el Televisor con TDT, ingrese S/N");
        System.out.println("TDT incrementa el costo en $500");
        String opc = leer.nextLine();
        if (opc.equalsIgnoreCase("s")) {
            setTdt(true);
        }else if(opc.equalsIgnoreCase("n")){
            setTdt(false);
        }
        
    }

    @Override
    public Double precioFinal() {
        Double precioFinalTv = super.precioFinal(); //To change body of generated methods, choose Tools | Templates.

        if (getPulgadas() > 40) {
            precioFinalTv += (precioFinalTv * .30);
        }
        if (isTdt()) {
            precioFinalTv += 500;
        }
        System.out.println("El valor a cancelar de su Televisor es: "+precioFinalTv);
        return precioFinalTv;
    }

}
