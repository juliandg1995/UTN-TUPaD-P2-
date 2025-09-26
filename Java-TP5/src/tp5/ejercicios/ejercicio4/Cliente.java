
package tp5.ejercicios.ejercicio4;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Cliente{

    // Atributos
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // lado inverso (bidireccional)

    // Constructores
    public Cliente(){}
    
    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public Cliente(String nombre, String dni, TarjetaDeCredito tarjeta){
        this.nombre = nombre;
        this.dni = dni;
        this.tarjeta = tarjeta;
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
    public TarjetaDeCredito getTarjeta(){
        return tarjeta;
    }
    public void setTarjeta(TarjetaDeCredito tarjeta){
        this.tarjeta = tarjeta;
    }

    // toString
    @Override
    public String toString(){
        return "Cliente{nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + tarjeta + "}";
    }
}