package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicios {

     private FabricanteDAO dao;

    public FabricanteServicios() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(int codigo, String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre de fabricante");
            }
            //if (crearFabricante(codigo,nombre)) {
            //    throw new Exception("Ya existe el fabricante ingresado" + nombre);
           // }
            //crear fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
}
