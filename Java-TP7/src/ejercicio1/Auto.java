
package ejercicio1;

/**
 * Clase Auto (extiende de Vehiculo)
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Auto extends Vehiculo{

    // Atributo específico del auto
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas){
        // Uso de super(...) para inicializar la parte de Vehiculo
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas(){
        return cantidadPuertas;
    }

    @Override
    public void mostrarInfo(){
        // Reutilizo getters de la superclase
        System.out.println(
                "Auto - Marca: " + getMarca()
                + ", Modelo: " + getModelo()
                + ", Puertas: " + cantidadPuertas
        );
    }
}
