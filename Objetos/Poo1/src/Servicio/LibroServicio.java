/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Libro;
import java.util.Scanner;


/**
 *
 * @author Ryzen
 */
public class LibroServicio {
    public Libro cargaLibro(){
        Libro b1 = new Libro();
        //Atributos
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el titulo del libro");
         b1.setTitulo(leer.nextLine());
         System.out.println("Ingrese el autor del libro");
         b1.setAutor(leer.nextLine());
         System.out.println("Ingrese el ISBN del libro");
         b1.setIsbn(leer.next());
         System.out.println("Ingrese el numero de paginas del libro");
         b1.setPaginas(leer.nextInt());
         leer.nextLine();
         return b1;
    }
    public void imprimirLibro(Libro b1){
        System.out.println("Numero de ISBN : "+b1.getIsbn()+" Titulo del libro : "+b1.getTitulo()+" Autor "+b1.getAutor()+", tiene "+b1.getPaginas()+" paginas");
        
    }
    
}
