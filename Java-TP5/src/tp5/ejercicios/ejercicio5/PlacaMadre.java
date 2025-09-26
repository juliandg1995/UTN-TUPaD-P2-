
package tp5.ejercicios.ejercicio5;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class PlacaMadre{

    // Atributos
    private String modelo;
    private String chipset;

    // Constructores
    public PlacaMadre(){}
    public PlacaMadre(String modelo, String chipset){
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getters/Setters
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getChipset(){
        return chipset;
    }
    public void setChipset(String chipset){
        this.chipset = chipset;
    }

    // toString
    @Override
    public String toString(){
        return "PlacaMadre{modelo=" + modelo + ", chipset=" + chipset + "}";
    }
}