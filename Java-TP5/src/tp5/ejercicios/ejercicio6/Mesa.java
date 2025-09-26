
package tp5.ejercicios.ejercicio6;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Mesa{

    // Atributos
    private int numero;
    private int capacidad;

    // Constructores
    public Mesa(){}
    public Mesa(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters/Setters
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    // toString
    @Override
    public String toString(){
        return "Mesa{numero=" + numero + ", capacidad=" + capacidad + "}";
    }
}