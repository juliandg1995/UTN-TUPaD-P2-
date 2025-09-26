
package tp5.ejercicios.ejercicio6;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Cliente{

    // Atributos
    private String nombre;
    private String telefono;

    // Constructores
    public Cliente(){}
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    // toString
    @Override
    public String toString(){
        return "Cliente{nombre=" + nombre + ", telefono=" + telefono + "}";
    }
}