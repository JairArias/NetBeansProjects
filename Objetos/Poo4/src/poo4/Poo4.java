/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
import Servicio.RectangulosServicio;
import Entidades.Rectangulos;

/**
 *
 * @author Ryzen
 */
public class Poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    RectangulosServicio rs=new RectangulosServicio();
    Rectangulos r1=rs.CrearRectangulos();
    rs.superficieRectangulo(r1);
    rs.perimetroRectangulo(r1);
    rs.impresionRectangulo(r1);
    }
    
}
