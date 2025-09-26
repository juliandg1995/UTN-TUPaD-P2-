
package tp5.ejercicios.ejercicio_11;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Reproductor{

    // Constructores
    public Reproductor(){}

    // toString
    @Override
    public String toString(){
        return "Reproductor{}";
    }

    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion);
    }
}
