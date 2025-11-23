
package ejercicio2;

/**
 * Clase Círculo (extiende de Figura)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Circulo extends Figura{

    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}

