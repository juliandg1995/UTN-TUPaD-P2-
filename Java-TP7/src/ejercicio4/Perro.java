
package ejercicio4;

/**
 * Clase Perro (extiende de Animal)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Perro extends Animal{

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }
}
