
package tp5.ejercicios.ejercicio_12;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Contribuyente{

    // Atributos
    private String nombre;
    private String cuil;

    // Constructores
    public Contribuyente(){}
    public Contribuyente(String nombre, String cuil){
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCuil(){
        return cuil;
    }
    public void setCuil(String cuil){
        this.cuil = cuil;
    }

    // toString
    @Override
    public String toString(){
        return "Contribuyente{nombre=" + nombre + ", cuil=" + cuil + "}";
    }
}