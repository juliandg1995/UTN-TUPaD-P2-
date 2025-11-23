
package ejercicio4;

/**
 * Clase Vaca (extiende de ANimal)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Vaca extends Animal{

    public Vaca(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: ¡Muuu!");
    }
}