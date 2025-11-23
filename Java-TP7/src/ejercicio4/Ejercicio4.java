
package ejercicio4;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Ejercicio 4
 * - Define la clase base Animal con hacerSonido() y describirAnimal().
 * - Implementa Perro, Gato y Vaca sobrescribiendo hacerSonido() con @Override.
 * - Usa una lista de Animal para invocar los sonidos polimórficamente.
 */

import java.util.ArrayList;
import java.util.List;


public class Ejercicio4{
    public static void main(String[] args){
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        
        System.out.println("SONIDOS DE LOS ANIMALES:");
        for(Animal a : animales){
            a.describirAnimal();    
            a.hacerSonido();        // llamada polimórfica
            System.out.println("-------------------------");
        }
    }
}
