
package tp5.ejercicios.ejercicio5;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Propietario{

    // Atributos
    private String nombre;
    private String dni;
    private Computadora computadora; // lado inverso (bidireccional)

    // Constructores
    public Propietario(){}
    public Propietario(String nombre, String dni, Computadora computadora){
        this.nombre = nombre;
        this.dni = dni;
        this.computadora = computadora;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public Computadora getComputadora(){
        return computadora;
    }
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
    }

    // toString
    @Override
    public String toString(){
        return "Propietario{nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + "}";
    }
}