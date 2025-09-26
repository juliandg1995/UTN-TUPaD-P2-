
package tp5.ejercicios.ejercicio1;

import java.util.Objects;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Titular{
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(){}

    public Titular(String nombre, String dni, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasaporte = pasaporte;
    }
    
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

    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }
        
}
