/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import ejercicio5_paises.utilidades.Comparadores;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Ryzen
 */
public class PaisesServicios {

    Scanner leer = new Scanner(System.in);
    Set<String> lista = new HashSet();

    public void guardarPais() {
        boolean continuar = false;
        do {

            System.out.println("Ingrese el nombre de un pais");
            lista.add(leer.nextLine());

            System.out.println("¿Desea ingresar otro pais? S/N");
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
        System.out.println("Lista de Paises guardados");
        
        for (String pais : lista) {
           System.out.println(pais);
        }
        System.out.println(" ");
    }

    public void ordenarPaises() {
        ArrayList<String> listaPais = new ArrayList(lista);
        Collections.sort(listaPais, Comparadores.ordenarPaisAs);
        System.out.println("Lista de Paises ordenados");
        for (String listaPai : listaPais) {
            System.out.println(listaPai);
        }
        System.out.println(" ");
    }

    public void buscarPais() {
        int cont=0;
        System.out.println("Digite el nombre del pais a eliminar");
        String pa = leer.nextLine();
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String lista = it.next();
            if (lista.equals(pa)){
                it.remove();
                cont=0;
                break;
            }else{
                cont+=1;
                  }

        }
        
        if(cont==lista.size()){
           System.out.println("El pais ingresado no esta en el conjunto");
           
        }else{
            System.out.println("Se elimina el pais de forma exitosa");
            lista.forEach((e) -> System.out.println(e));
        }
        
    }
}
