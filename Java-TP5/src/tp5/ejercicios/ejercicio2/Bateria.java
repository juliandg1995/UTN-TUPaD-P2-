
package tp5.ejercicios.ejercicio2;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */
public class Bateria{
    
    // Atributos
    private String modelo;
    private int capacidad; 
    
    // Constructores
    public Bateria(){}

    public Bateria(String modelo, int capacidad){
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters/ Settters 
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return "Bateria{modelo=" + modelo + ", capacidad=" + capacidad + "}";
    }
    
}
