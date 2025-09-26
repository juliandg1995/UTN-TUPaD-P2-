
package tp5.ejercicios.ejercicio4;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Banco{

    // Atributos
    private String nombre;
    private String cuit;

    // Constructores
    public Banco(){}
    public Banco(String nombre, String cuit){
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCuit(){
        return cuit;
    }
    public void setCuit(String cuit){
        this.cuit = cuit;
    }

    // toString
    @Override
    public String toString(){
        return "Banco{nombre=" + nombre + ", cuit=" + cuit + "}";
    }
}