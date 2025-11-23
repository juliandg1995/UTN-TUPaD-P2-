
package Ejercicio1.model;
import Ejercicio1.constants.CategoriaProducto;


/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

import java.util.ArrayList;
import java.util.List;

public class Inventario{

    // Colección dinámica de productos
    private List<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void listarProductos(){
        for(Producto p : productos){
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id){
        for(Producto p : productos){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id){
        Producto encontrado = buscarProductoPorId(id);
        if(encontrado != null){
            return productos.remove(encontrado);
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if(p != null){
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos){
            if(p.getCategoria() == categoria){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public int obtenerTotalStock(){
        int total = 0;
        for(Producto p : productos){
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock(){
        if(productos.isEmpty()){
            return null;
        }
        Producto max = productos.get(0);
        for(Producto p : productos){
            if(p.getCantidad() > max.getCantidad()){
                max = p;
            }
        }
        return max;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max){
        List<Producto> resultado = new ArrayList<>();
        for(Producto p : productos){
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto c : CategoriaProducto.values()){
            System.out.println(c.name() + " - " + c.getDescripcion());
        }
    }
}

