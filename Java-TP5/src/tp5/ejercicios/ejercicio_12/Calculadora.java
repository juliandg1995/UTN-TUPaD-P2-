
package tp5.ejercicios.ejercicio_12;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Calculadora{

    // Constructor
    public Calculadora(){}

    // toString
    @Override
    public String toString(){
        return "Calculadora{}";
    }

    // Dependencia de uso: recibe un Impuesto y lo "calcula"
    public void calcular(Impuesto impuesto){
        System.out.println("Calculando impuesto: " + impuesto);
    }
}
