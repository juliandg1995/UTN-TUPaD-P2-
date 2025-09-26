
package tp5.ejercicios.ejercicio9;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Paciente{

    // Atributos
    private String nombre;
    private String obraSocial;

    // Constructores
    public Paciente(){}
    public Paciente(String nombre, String obraSocial){
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getObraSocial(){
        return obraSocial;
    }
    public void setObraSocial(String obraSocial){
        this.obraSocial = obraSocial;
    }

    // toString
    @Override
    public String toString(){
        return "Paciente{nombre=" + nombre + ", obraSocial=" + obraSocial + "}";
    }
}