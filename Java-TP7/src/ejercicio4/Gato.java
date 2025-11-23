
package ejercicio4;

/**
 * Clase Gato (extiende de Animal)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}

