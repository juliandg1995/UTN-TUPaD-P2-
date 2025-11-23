
package ejercicio4;

/**
 * Clase Animal
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Animal{

    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    // Método genérico que luego será sobrescrito
    public void hacerSonido(){
        System.out.println("El animal hace un sonido genérico.");
    }

    public void describirAnimal(){
        System.out.println("Animal: " + this.getClass().getSimpleName() + "\n" +
                           "Nombre: " + nombre);
    }
}

