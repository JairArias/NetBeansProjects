/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;


/**
 *
 * @author Ryzen
 */
public class Poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  CuentaBancariaServicio cbs = new CuentaBancariaServicio();
 
  CuentaBancaria cb=cbs.AbrirCuenta(); cbs.ingresar(); cbs.retirar();cbs.extraccionRapida();
  cbs.consultarSaldo(cb);
  cbs.consultarDatos(cb);
    }
    
}
