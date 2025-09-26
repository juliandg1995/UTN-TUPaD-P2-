
package tp5.ejercicios.ejercicio_12;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Impuesto{

    // Atributos
    private double monto;
    private Contribuyente contribuyente; // asociacion unidireccional

    // Constructores
    public Impuesto(){}
    public Impuesto(double monto, Contribuyente contribuyente){
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    // Getters/Setters
    public double getMonto(){
        return monto;
    }
    public void setMonto(double monto){
        this.monto = monto;
    }
    public Contribuyente getContribuyente(){
        return contribuyente;
    }
    public void setContribuyente(Contribuyente contribuyente){
        this.contribuyente = contribuyente;
    }

    // toString
    @Override
    public String toString(){
        return "Impuesto{monto=" + monto + ", contribuyente=" + contribuyente + "}";
    }
}
