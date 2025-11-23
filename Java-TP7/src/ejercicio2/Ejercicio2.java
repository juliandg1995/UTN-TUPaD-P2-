
package ejercicio2;

import java.util.ArrayList;

/**
 * Clase para probar la representación de áreas de manera polimórfica
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Ejercicio2{
    public static void main(String[] args){
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        
        // Upcasting implícito: Circulo y Rectangulo se tratan como Figura
        figuras.add(new Circulo("Círculo pequeño", 2.5));
        figuras.add(new Rectangulo("Rectángulo 1", 4.0, 3.0));
        figuras.add(new Circulo("Círculo grande", 5.0));

        System.out.println("ÁREAS DE FIGURAS:");
        for(Figura f : figuras){
            double area = f.calcularArea(); // llamada polimórfica
            System.out.println(f.getNombre() + " -> Área = " + area);
        }
    }
}
