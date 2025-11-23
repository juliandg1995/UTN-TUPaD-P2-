
package Ejercicio1.constants;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public enum CategoriaProducto{
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Constructor del enum para asociar la descripción
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }

    // Getter para acceder a la descripción legible
    public String getDescripcion(){
        return descripcion;
    }
}