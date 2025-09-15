package tp3.modelos;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Clase que representa una gallina de la granja digital.
 * Trabajo con tres atributos básicos y métodos de acción/consulta del estado.
 */
public class Gallina{
    // Mantengo encapsulamiento para evitar modificaciones directas desde fuera
    private String idGallina;
    private int edad;           // Edad en semanas (uso semanas para granularidad)
    private int huevosPuestos;  // Conteo acumulado de huevos

    // Constructor por defecto
    public Gallina(){}

    // Constructor parametrizado para iniciar con datos consistentes
    public Gallina(String idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = Math.max(0, edad);                // Evito valores negativos
        this.huevosPuestos = Math.max(0, huevosPuestos);
    }

    // Acciones requeridas por la consigna
    public void ponerHuevo(){
        // Sumo uno al contador de huevos; protejo de overflow por prolijidad
        if(huevosPuestos < Integer.MAX_VALUE){
            huevosPuestos++;
        }
    }

    public void envejecer(){
        // Incremento la edad en una unidad (1 semana según el criterio adoptado)
        if(edad < Integer.MAX_VALUE){
            edad++;
        }
    }

    public void mostrarEstado(){
        // Muestro el estado actual de la gallina de forma legible
        System.out.printf("Gallina %s | Edad: %d semanas | Huevos puestos: %d%n",
                idGallina, edad, huevosPuestos);
    }
}