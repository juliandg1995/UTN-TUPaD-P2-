
package tp5.ejercicios.ejercicio_14;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Proyecto{

    // Atributos
    private String nombre;
    private int duracionMin;

    // Constructores
    public Proyecto(){}
    public Proyecto(String nombre, int duracionMin){
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDuracionMin(){
        return duracionMin;
    }
    public void setDuracionMin(int duracionMin){
        this.duracionMin = duracionMin;
    }

    // toString
    @Override
    public String toString(){
        return "Proyecto{nombre=" + nombre + ", duracionMin=" + duracionMin + "}";
    }
}
