package tp3.modelos;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Entidad Estudiante
 */
public class Estudiante {
    
    // Atributos
    private static final double MIN_CAL = 0.0;
    private static final double MAX_CAL = 10.0;

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor parametrizado
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); // asegura rango válido
    }

    // Getters/Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) {
        // Se normaliza la calificación al rango permitido
        if (calificacion < MIN_CAL) {
            this.calificacion = MIN_CAL;
        }
        else if (calificacion > MAX_CAL) {
            this.calificacion = MAX_CAL;
        }
        else {
            this.calificacion = calificacion;
        }
    }

    // Comportamiento
    public void subirCalificacion(double puntos) {
        if (puntos < 0) return; // no se permiten negativos
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) return; // no se permiten negativos
        setCalificacion(this.calificacion - puntos);
    }

    public void mostrarInfo() {
        // Se imprime estado actual
        System.out.printf("Estudiante: %s %s | Curso: %s | Calificación: %.2f%n",
                nombre, apellido, curso, calificacion);
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', apellido='" + apellido +
               "', curso='" + curso + "', calificacion=" + calificacion + "}";
    }
}
