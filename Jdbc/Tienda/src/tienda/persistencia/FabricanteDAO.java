package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Se debe ingresar un fabricante");
            }
            String sql = "INSERT INTO Fabricante (codigo, nombre)"
                    + "VALUES ('" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante consultaFabricante(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante ";
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
