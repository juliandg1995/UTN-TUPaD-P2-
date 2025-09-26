
package tp5.ejercicios.ejercicio_10;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Titular{

    // Atributos
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // lado inverso de la asociación bidireccional

    // Constructores
    public Titular(){}
    public Titular(String nombre, String dni, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
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
    public CuentaBancaria getCuenta(){
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }

    // toString
    @Override
    public String toString(){
        return "Titular{nombre=" + nombre + ", dni=" + dni + ", cuenta=" + cuenta + "}";
    }
}
