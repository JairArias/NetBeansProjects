/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Vendedor;
import java.util.Date;

/**
 *
 * @author Ryzen
 */
public class VendedorServicio {

    public Vendedor altaVendedor() {
        //instancian un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
//llenar atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.nextLine());
        System.out.println("Ingrese el DNI");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo base del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia de ingreso del trabajador");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de ingreso del trabajador");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de ingreso del trabajador");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;

    }

    public void sueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas * .15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor "
                + v1.getNombre() + " es de $ " + v1.getSueldoMensual());

    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaiones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaiones");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaiones proporcionales");
        }
    }
