/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class OperacionServicio {

    public Scanner leer = new Scanner(System.in);
    public Operacion objeto;

    //constructor 
    public OperacionServicio() {
        objeto = CrearOperacion();
    }

    public OperacionServicio(Operacion objeto) {
        this.objeto = objeto;
    }

    private Operacion CrearOperacion() {
        objeto = new Operacion();
        System.out.println("Ingrese el primer numero");
        objeto.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        objeto.setNumero2(leer.nextInt());
        return objeto;
    }

    public int sumaOperacion() {
        int suma = objeto.getNumero1() + objeto.getNumero2();
        //System.out.println(suma);
        return suma;
    }

    public int restaOperacion() {
        int resta = objeto.getNumero1() - objeto.getNumero2();
        //System.out.println(resta);
    return resta;
    }

    public int multiplicaOperacion() {
        int multiplica;
        if (objeto.getNumero1()==0 || objeto.getNumero2()==0){
              multiplica = 0;
               System.out.println("Esta multiplicando por un valor errado: 0");       
    
        }else{
            multiplica =objeto.getNumero1() * objeto.getNumero2();
            
        }
      return multiplica;
    }

    public int dividirOperacion() {
        int dividir;
        if (objeto.getNumero1()==0 || objeto.getNumero2()==0){
              dividir = 0;
              System.out.println("Esta dividiendo por un valor errado: 0");       
    
        }else{
           dividir = objeto.getNumero1() / objeto.getNumero2();
            
        }

    return dividir;
    }
}
