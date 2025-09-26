
package tp5.ejercicios.ejercicio3;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Autor{
    
    // Atributos
    private String nombre;
    private String nacionalidad;

    // Constructores
    public Autor(){}
    public Autor(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    // toString
    @Override
    public String toString(){
        return "Autor{nombre=" + nombre + ", nacionalidad=" + nacionalidad + "}";
    }

}
