package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public Collection<Producto> consultaTodosProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> consultaNombrePrecioProductos() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> consultaPrecioProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE precio >= 120 AND precio <= 202";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> consultaPortatilesProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE 'port%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> consultaNombrePrecioBaratoProductos() throws Exception {
        try {
            String sql = "SELECT MIN(nombre), MIN(precio) FROM Producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Se debe ingresar un producto");
            }
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '"
                    + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "');";

            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Se debe indicar un producto a modificar");
            }
            String sql = "UPDATE Producto SET "
                    + "precio ='" + producto.getPrecio() + "' WHERE codigo = '" + producto.getCodigo() + "';'";

            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
