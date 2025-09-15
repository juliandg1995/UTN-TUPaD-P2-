package tp3.modelos;

import java.time.Year;

/**
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 * Clase Libro para ejercicio 3.
 */
public class Libro {
    // Rango admitido para año de publicación
    public static final int MIN_ANIO = 1450; //

    private String titulo;
    private String autor;
    private int anioPublicacion;

    // ---------- Año máximo (actual) ----------
    public static int maxAnioAdmitido() {
        return Year.now().getValue();
    }

    // ---------- Constructores ----------
    public Libro(){ }

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // valida rango
    }

    // ---------- Getters requeridos ----------
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // ---------- Setters ----------
    public void setAnioPublicacion(int anioPublicacion){
        int max = maxAnioAdmitido();
        if (anioPublicacion >= MIN_ANIO && anioPublicacion <= max){
            this.anioPublicacion = anioPublicacion;
        }else{
            // Se rechaza el cambio y se informa utilizando valores parametrizados
            System.out.printf(
                "Año inválido (%d). Debe estar entre %d y %d. Se mantiene: %d.%n",
                anioPublicacion, MIN_ANIO, max, this.anioPublicacion
            );
        }
    }

    // ---------- Visualización de datos ----------
    @Override
    public String toString(){
        return "Libro{titulo='" + titulo + "', autor='" + autor +
               "', anioPublicacion=" + anioPublicacion + "}";
    }

    public void mostrarInfo(){
        System.out.printf("Título: %s | Autor: %s | Año: %d%n",
                titulo, autor, anioPublicacion);
    }
}