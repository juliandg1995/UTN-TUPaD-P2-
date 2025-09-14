package tp3.io;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Lecturas por teclado con validaciones simples y reintentos.
 * Reutilizable en todos los ejercicios.
 */
public final class Consola {
    private static final Scanner IN = new Scanner(System.in);

    // ---------- Lecturas básicas ----------
    public static String leerLineaNoVacia(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = IN.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("No puede quedar vacío.");
        }
    }

    public static String leerCoincidiendo(String prompt, String regex, String msgError) {
        while (true) {
            String s = leerLineaNoVacia(prompt);
            if (s.matches(regex)) return s;
            System.out.println(msgError);
        }
    }

    public static int leerEntero(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String s = IN.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Valor inválido. Ingrese un entero.");
            }
        }
    }

    public static int leerEntero(String prompt, int min, int max) {
        while (true) {
            int v = leerEntero(prompt);
            if (v < min || v > max) {
                System.out.printf("Fuera de rango [%d..%d].%n", min, max);
            } else return v;
        }
    }

    public static double leerDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String s = IN.nextLine().trim().replace(',', '.');
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Ingrese un número (ej: 12.5).");
            }
        }
    }

    public static double leerDouble(String prompt, double min, double max) {
        while (true) {
            double v = leerDouble(prompt);
            if (v < min || v > max) {
                System.out.printf("Fuera de rango [%.2f..%.2f].%n", min, max);
            } else return v;
        }
    }

    public static boolean leerSiNo(String prompt) {
        while (true) {
            String s = leerLineaNoVacia(prompt + " (s/n): ").toLowerCase();
            if (s.equals("s") || s.equals("si") || s.equals("sí")) return true;
            if (s.equals("n") || s.equals("no")) return false;
            System.out.println("Responda con 's' o 'n'.");
        }
    }
}