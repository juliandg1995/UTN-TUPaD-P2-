
package tp5.ejercicios.ejercicio9;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Profesional{

    // Atributos
    private String nombre;
    private String especialidad;

    // Constructores
    public Profesional(){}
    public Profesional(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    // toString
    @Override
    public String toString(){
        return "Profesional{nombre=" + nombre + ", especialidad=" + especialidad + "}";
    }
}
