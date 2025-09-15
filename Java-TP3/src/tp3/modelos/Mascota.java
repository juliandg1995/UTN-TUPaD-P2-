package tp3.modelos;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Entidad Mascota con encapsulamiento, constructores y operaciones de edad.
 */
public class Mascota {
    // Atributos privados
    private String nombre;
    private String especie;
    private int    edad;     // en años (no negativo)

    // Constructor parametrizado
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        setEdad(edad);          // Se asegura un valor coherente
    }

    // Getters/Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        // Se evita edad negativa
        this.edad = Math.max(0, edad);
    }

    // Acciones requeridas
    public void cumplirAnios() {
        // Se incrementa la edad en 1 año
        if (edad < Integer.MAX_VALUE) {
            edad++;
        }
    }

    public void mostrarInfo() {
        // Se imprime el estado actual
        System.out.printf("Mascota: %s | Especie: %s | Edad: %d años%n",
                nombre, especie, edad);
    }

    @Override
    public String toString() {
        return "Mascota{nombre='" + nombre + "', especie='" + especie + "', edad=" + edad + "}";
    }
}