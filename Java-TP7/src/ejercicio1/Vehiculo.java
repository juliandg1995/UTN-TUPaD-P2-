
package ejercicio1;

/**
 * Clase Vehículo
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Vehiculo{

    // Atributos básicos compartidos por todos los vehículos
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    // Método que luego será sobrescrito en la subclase
    public void mostrarInfo(){
        System.out.println("Vehículo - Marca: " + marca + ", Modelo: " + modelo);
    }
}

