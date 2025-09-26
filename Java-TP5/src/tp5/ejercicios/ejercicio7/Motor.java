
package tp5.ejercicios.ejercicio7;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Motor{

    // Atributos
    private String tipo;
    private String numeroSerie;

    // Constructores
    public Motor(){}
    public Motor(String tipo, String numeroSerie){
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Getters/Setters
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    // toString
    @Override
    public String toString(){
        return "Motor{tipo=" + tipo + ", numeroSerie=" + numeroSerie + "}";
    }
}
