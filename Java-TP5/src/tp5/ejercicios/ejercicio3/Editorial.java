
package tp5.ejercicios.ejercicio3;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Editorial{
    
    // Atributos
    private String nombre;
    private String direccion;

    // Constructores
    public Editorial(){}
    public Editorial(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    // toString
    @Override
    public String toString(){
        return "Editorial{nombre=" + nombre + ", direccion=" + direccion + "}";
    }

}