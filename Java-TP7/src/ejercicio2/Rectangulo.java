
package ejercicio2;

/**
 * Clase Rectangulo (extiende de Figura)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}

