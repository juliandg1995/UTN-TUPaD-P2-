
package ejercicio2;

/**
 * Clase abstracta Figura
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public abstract class Figura{

    // Nombre descriptivo de la figura
    private String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    // Método abstracto: cada figura calcula su área de forma distinta
    public abstract double calcularArea();
}

