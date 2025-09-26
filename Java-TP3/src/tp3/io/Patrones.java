package tp3.io;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Clase para enviar patrones regex útiles para validar formatos cuando se leen
 * valores por teclado
 */
public final class Patrones {

    private Patrones() {
    }

    // Alfanumérico ASCII + espacio
    public static String alfanumericoAscii(int min, int max) {
        return "^[A-Za-z0-9 ]{" + min + "," + max + "}$";
    }

    // Letras/dígitos Unicode + espacio
    public static String alfanumericoUnicode(int min, int max) {
        return "^[\\p{L}\\p{N} ]{" + min + "," + max + "}$";
    }

    // Solo dígitos numéricos
    public static String numerico(int minLen, int maxLen) {
        return "^\\d{" + minLen + "," + maxLen + "}$";
    }

    public static String fechaISO() {
        return "^\\d{4}-\\d{2}-\\d{2}$";
    }

    public static String formatoImagenBasico() {
        return "(?i)^(JPG|PNG)$";
    }

    public static String siNoBasico() {
        return "(?i)^(s|si|sí|n|no)$";
    }
    
    //  ------ Utilizados en TP5 ------ //
    // Formato email
    public static String email(){
        return "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
    }

    // Hora en formato 24h HH:mm
    public static String horaHHmm24() {
        return "^(?:[01]\\d|2[0-3]):[0-5]\\d$";
    }
}
