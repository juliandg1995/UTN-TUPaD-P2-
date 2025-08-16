
package javaapplication1;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Variables {

    private String nombre;
    private int edad;
    private double altura;
    private boolean estudiante;
    
    public Variables(String nombre, int edad, double altura, boolean estudiante){
       this.nombre = nombre;
       this.edad = edad;
       this.altura = altura;
       this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Altura: " + altura + "\n"
                + "Estudiante: " + estudiante;
    }
    
    public static void main(String[] args) {
        Variables variables = new Variables("Julian", 30, 1.70, true);
        System.out.println(variables.toString());
    }
                    
}
