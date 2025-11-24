import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import ejercicio2.EdadInvalidaException;

/**
 * Demostración de los ejercicios de excepciones del TP8.
 * Cada método resuelve un punto y contiene comentarios sobre el uso de try/catch.
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class DemoExcepciones{

    // Scanner compartido para leer desde consola
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        divisionSegura();
        conversionCadenaNumero();
        lecturaArchivoSimple();
        pruebaEdadInvalida();
        lecturaArchivoConTryWithResources();
    }

    /**
     * 1) División segura
     * - Maneja ArithmeticException (UNchecked) cuando el divisor es cero.
     */
    private static void divisionSegura(){
        System.out.println("\n=== 1) DIVISIÓN SEGURA ===");
        try{
            System.out.print("Ingrese el dividendo (entero): ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el divisor (entero): ");
            int b = Integer.parseInt(scanner.nextLine());

            // Esta línea puede lanzar ArithmeticException si b es 0
            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException e){
            // ArithmeticException es una RuntimeException (unchecked).
            // La capturamos para evitar que el programa se caiga por división por cero.
            System.out.println("Error: no se puede dividir por cero.");
        }catch(NumberFormatException e){
            // Por si el usuario no escribe un número entero válido.
            System.out.println("Error: debe ingresar valores enteros válidos.");
        }
    }

    /**
     * 2) Conversión de cadena a número
     * - Maneja NumberFormatException (UNchecked) cuando el texto no es un entero válido.
     */
    private static void conversionCadenaNumero(){
        System.out.println("\n=== 2) CONVERSIÓN CADENA A NÚMERO ===");
        System.out.print("Ingrese un número entero en texto: ");
        String texto = scanner.nextLine();

        try{
            int valor = Integer.parseInt(texto);
            System.out.println("Conversión correcta. Valor = " + valor);
        }catch(NumberFormatException e){
            // NumberFormatException también es una RuntimeException.
            // La usamos para validar entrada del usuario de forma segura.
            System.out.println("Error: '" + texto + "' no es un entero válido.");
        }
    }

    /**
     * 3) Lectura de archivo simple
     * - Maneja FileNotFoundException (CHECKED) si el archivo no existe.
     * - Usamos un try tradicional con finally para cerrar el recurso manualmente.
     */
    private static void lecturaArchivoSimple(){
        System.out.println("\n=== 3) LECTURA DE ARCHIVO (try clásico) ===");
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String ruta = scanner.nextLine();

        BufferedReader br = null; // recurso que debemos cerrar en finally

        try{
            // FileReader y BufferedReader pueden lanzar FileNotFoundException
            br = new BufferedReader(new FileReader(ruta));

            System.out.println("Contenido del archivo:");
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        }catch(FileNotFoundException e){
            // FileNotFoundException es CHECKED, por eso debemos capturarla o declarar throws.
            System.out.println("Error: el archivo no existe o la ruta es incorrecta.");
        }catch(IOException e){
            // IOException cubre errores de lectura.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }finally{
            // El bloque finally se ejecuta SIEMPRE, haya o no excepción.
            // Se usa para asegurar que liberamos recursos (cerrar el BufferedReader).
            if(br != null){
                try{
                    br.close();
                }catch(IOException e){
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }

    /**
     * 4) Uso de excepción personalizada EdadInvalidaException.
     * - El método validarEdad "lanza" (throw) la excepción si la edad no está en el rango permitido.
     * - Quien llama a validarEdad debe manejar (catch) la excepción porque es CHECKED.
     */
    private static void pruebaEdadInvalida(){
        System.out.println("\n=== 4) EXCEPCIÓN PERSONALIZADA EdadInvalidaException ===");
        System.out.print("Ingrese una edad: ");
        String texto = scanner.nextLine();

        try{
            int edad = Integer.parseInt(texto);

            // validarEdad declara throws EdadInvalidaException (CHECKED),
            // por eso el llamado debe estar dentro de un try/catch.
            validarEdad(edad);

            System.out.println("Edad válida: " + edad);

        }catch(NumberFormatException e){
            System.out.println("Error: la edad debe ser un número entero.");
        }catch(EdadInvalidaException e){
            // Capturamos nuestra excepción de negocio y mostramos el mensaje definido por nosotros.
            System.out.println("Edad inválida: " + e.getMessage());
        }
    }

    /**
     * Valida que la edad esté entre 0 y 120.
     * Si no cumple la regla de negocio, dispara la excepción CHECKED EdadInvalidaException.
     */
    private static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad < 0 || edad > 120){
            // throw lanza explícitamente la excepción; corta el flujo normal
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }

    /**
     * 5) Lectura de archivo usando try-with-resources.
     * - Esta estructura cierra automáticamente el BufferedReader al salir del bloque,
     *   incluso si ocurre una excepción.
     * - Es la forma recomendada para trabajar con recursos que implementan AutoCloseable.
     */
    private static void lecturaArchivoConTryWithResources(){
        System.out.println("\n=== 5) LECTURA DE ARCHIVO (try-with-resources) ===");
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String ruta = scanner.nextLine();

        // En el paréntesis del try declaramos el recurso.
        // try-with-resources garantiza el cierre automático del recurso.
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            System.out.println("Contenido del archivo:");
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: el archivo no existe o la ruta es incorrecta.");
        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No hace falta finally para cerrar el recurso: lo hace automáticamente el try-with-resources.
    }
}
