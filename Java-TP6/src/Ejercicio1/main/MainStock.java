
package Ejercicio1.main;
import Ejercicio1.model.Producto;
import Ejercicio1.model.Inventario;
import Ejercicio1.constants.CategoriaProducto;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class MainStock{
    public static void main(String[] args){
        Inventario inventario = new Inventario();

        // 1) Crear al menos cinco productos y agregarlos
        Producto p1 = new Producto("P001", "Arroz", 900, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 6000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 8000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletitas", 1200, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2) Listar todos los productos
        System.out.println("=== LISTADO COMPLETO ===");
        inventario.listarProductos();

        // 3) Buscar un producto por ID
        System.out.println("\n=== BUSCAR POR ID (P003) ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if(buscado != null){
            buscado.mostrarInfo();
        }

        // 4) Filtrar por categoría
        System.out.println("\n=== PRODUCTOS ALIMENTOS ===");
        for(Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)){
            p.mostrarInfo();
        }

        // 5) Eliminar un producto y listar el resto
        System.out.println("\n=== ELIMINAR P002 Y LISTAR ===");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // 6) Actualizar stock de un producto
        System.out.println("\n=== ACTUALIZAR STOCK P001 A 80 ===");
        inventario.actualizarStock("P001", 80);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7) Mostrar total de stock
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        // 8) Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto max = inventario.obtenerProductoConMayorStock();
        if(max != null){
            max.mostrarInfo();
        }

        // 9) Filtrar precios entre 1000 y 3000
        System.out.println("\n=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        for(Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)){
            p.mostrarInfo();
        }

        // 10) Mostrar categorías disponibles
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
