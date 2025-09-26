
package tp5.ejercicios.ejercicio8;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Usuario{

    // Atributos
    private String nombre;
    private String email;

    // Constructores
    public Usuario(){}
    
    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // toString
    @Override
    public String toString(){
        return "Usuario{nombre=" + nombre + ", email=" + email + "}";
    }
}
