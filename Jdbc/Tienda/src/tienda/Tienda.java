
package tienda;

import tienda.servicios.FabricanteServicios;

 public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        FabricanteServicios fabricanteServicios = new FabricanteServicios();
    
        fabricanteServicios.crearFabricante(11,"LG");
        
    }
    
}
