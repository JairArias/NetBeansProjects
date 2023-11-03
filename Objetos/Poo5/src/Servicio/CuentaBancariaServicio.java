/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryzen
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    Random r1 = new Random();

    CuentaBancaria cb = new CuentaBancaria();
    double ingreso;
    double retiro;
    double eRapida;

    public CuentaBancaria AbrirCuenta() {
        //   CuentaBancaria cb=new CuentaBancaria();
        System.out.println("Vamos a crear su cuenta Bancaria!");
        System.out.println("Ingrese su nombre y apellidos");
        cb.setNombre(leer.nextLine());
        System.out.println("Ingrese su numero DNI");
        cb.setDni(leer.nextLong());
        System.out.println("Ingrese el tipo de cuenta a crear");
        System.out.println("A- Cuenta Corriente");
        System.out.println("B- Cuenta Ahorros");
        cb.setTipo(leer.next());
               
        System.out.println("Ingrese la cantidad de dinero que va consignar");
        cb.setConsignar(leer.nextDouble());
        //leer.next();
        cb.setSaldo(cb.getConsignar());
        cb.setNumeroCuenta((int) r1.nextInt() * +1000000);
        return cb;
    }

    public CuentaBancaria ingresar() {
        System.out.println("Bienvenido a consignaciones");
        System.out.println("Ingrese el valor a consignar");
        ingreso = leer.nextDouble();
        cb.setSaldo(cb.getSaldo() + ingreso);
        return cb;
    }

    public CuentaBancaria retirar() {
        System.out.println("Bienvenido a retiros");
        System.out.println("Ingrese la cantidad de dinero a retirar");
        retiro = leer.nextDouble();
        if (cb.getSaldo() < retiro) {
            cb.setSaldo(0);
        } else {
            cb.setSaldo(cb.getSaldo() - retiro);
        }
        return cb;
    }

    public CuentaBancaria extraccionRapida() {
        eRapida = cb.getSaldo() * .20;
        System.out.println("Bienvenido a Retiro Rapido");
        System.out.println("Digite la cantidad que desea retirar");
        retiro = leer.nextDouble();
        if (retiro <= eRapida) {
            cb.setSaldo(cb.getSaldo() - retiro);
        } else {
            System.out.println("No puede retirar la cantidad solicitada.");
        }
        return cb;
    }

    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su cuenta presenta un saldo: " + cb.getSaldo());
    }

    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Cliente :" + cb.getNombre());
        System.out.println("DNI: " + cb.getDni());
        System.out.println("Numero Cuenta: " + cb.getNumeroCuenta());
        if (cb.getTipo().equals("A")){
            System.out.println("Cuenta Corriente");
        }if (cb.getTipo().equals("B")){
            System.out.println("Cuenta Ahorros");
        }

    }

}
