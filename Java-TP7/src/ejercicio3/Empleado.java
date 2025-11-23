
package ejercicio3;

/**
 * Polimorfia
 * Clase abstracta Empleado
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public abstract class Empleado{

    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    // Cada tipo de empleado calcula su sueldo de forma distinta
    public abstract double calcularSueldo();
}

