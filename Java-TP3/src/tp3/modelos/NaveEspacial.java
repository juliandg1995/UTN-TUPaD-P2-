package tp3.modelos;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Clase NaveEspacial para ejercicio 5
 */

public class NaveEspacial{
    
    // Defino una capacidad máxima para impedir sobrecargas al recargar
    private static final int MAX_COMBUSTIBLE = 100;
    // Consumo adoptado: 1 unidad de combustible por unidad de distancia
    private static final int CONSUMO_POR_UNIDAD = 1;

    // Atributos encapsulados solicitados
    private String nombre;
    private int combustible;

    // Constructor por defecto (dejo la nave sin nombre y sin combustible)
    public NaveEspacial(){}

    // Constructor parametrizado (normalizo combustible al rango 0..MAX)
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        setCombustible(combustible);
    }

    // Getters auxiliares 
    public String getNombre(){ return nombre; }
    public int getCombustible(){ return combustible; }

    // Setter privado para normalizar la carga del combustible
    private void setCombustible(int valor){
        if(valor < 0){
            this.combustible = 0;
        }else if(valor > MAX_COMBUSTIBLE){
            this.combustible = MAX_COMBUSTIBLE;
        }else{
            this.combustible = valor;
        }
    }

    // Acción: despegar (valido que haya combustible > 0, sin consumirlo en este modelo)
    public void despegar(){
        if(combustible > 0){
            System.out.println("La nave " + nombre + " ha despegado correctamente.");
        }else{
            System.out.println("No es posible despegar: combustible insuficiente.");
        }
    }

    // Acción: avanzar cierta distancia si hay combustible suficiente
    public void avanzar(int distancia){
        if(distancia <= 0){
            System.out.println("La distancia a avanzar debe ser positiva.");
            return;
        }
        int requerido = distancia * CONSUMO_POR_UNIDAD;
        if(combustible < requerido){
            System.out.printf("Combustible insuficiente para avanzar %d unidades. Disponible: %d.%n",
                    distancia, combustible);
            return;
        }
        combustible -= requerido;
        System.out.printf("La nave avanzó %d unidades. Combustible restante: %d.%n",
                distancia, combustible);
    }

    // Acción: recargar combustible sin superar el tope
    public void recargarCombustible(int cantidad){
        if(cantidad <= 0){
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        int antes = combustible;
        setCombustible(combustible + cantidad);
        int cargadoReal = combustible - antes;
        if(cargadoReal < cantidad){
            System.out.printf("Se recargaron %d unidades (tope alcanzado: %d).%n",
                    cargadoReal, MAX_COMBUSTIBLE);
        }else{
            System.out.printf("Se recargaron %d unidades. Combustible actual: %d.%n",
                    cargadoReal, combustible);
        }
    }

    // Consulta del estado actual (nombre + combustible / capacidad)
    public void mostrarEstado(){
        System.out.printf("Nave: %s | Combustible: %d/%d%n",
                nombre, combustible, MAX_COMBUSTIBLE);
    }

    // Método estático auxiliar para conocer la capacidad máxima desde el ejercicio
    public static int capacidadMaxima(){ return MAX_COMBUSTIBLE; }
}
