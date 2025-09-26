
package tp5.ejercicios.ejercicio7;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Conductor{

    // Atributos
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;  // lado inverso (bidireccional)

    // Constructores
    public Conductor(){}
    
    public Conductor(String nombre, String licencia, Vehiculo vehiculo){
        this.nombre = nombre;
        this.licencia = licencia;
        this.vehiculo = vehiculo;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getLicencia(){
        return licencia;
    }
    public void setLicencia(String licencia){
        this.licencia = licencia;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    // toString
    @Override
    public String toString(){
        return "Conductor{nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + vehiculo + "}";
    }
}