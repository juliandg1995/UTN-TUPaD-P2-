
package ejercicio1;

/**
  * Ejercicio 1
 * - Define la jerarquía Vehiculo -> Auto usando herencia.
 * - Sobrescribe el método mostrarInfo() en la subclase.
 * - Instancia un Auto y muestra su información completa.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Ejercicio1{
    public static void main(String[] args){
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo(); // Llamada polimórfica al método sobrescrito
    }
}
