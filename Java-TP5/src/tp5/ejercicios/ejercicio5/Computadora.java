
package tp5.ejercicios.ejercicio5;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Computadora{

    // Atributos
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;    // composicion (obligatoria)
    private Propietario propietario;  // asociacion bidireccional

    // Constructores
    public Computadora(){}
    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
    }

    // Getters/Setters
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    public PlacaMadre getPlacaMadre(){
        return placaMadre;
    }
    public void setPlacaMadre(PlacaMadre placaMadre){
        this.placaMadre = placaMadre;
    }
    public Propietario getPropietario(){
        return propietario;
    }
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
    }

    // toString
    @Override
    public String toString(){
        return "Computadora{marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + "}";
    }
}
