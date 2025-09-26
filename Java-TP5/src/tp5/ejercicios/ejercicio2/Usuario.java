
package tp5.ejercicios.ejercicio2;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Usuario{
    
    // Atributos
    private String nombre;
    private String dni;
    private Celular celular; // lado inverso de la asociación

    // Constructores
    public Usuario(){}

    public Usuario(String nombre, String dni, Celular celular){
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }
    
    // Getters/ Settters 
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

    public Celular getCelular(){
        return celular;
    }
    public void setCelular(Celular celular){
        this.celular = celular;
    }
    
    // toString
    @Override
    public String toString(){
        return "Usuario{nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + "}";
    }
}