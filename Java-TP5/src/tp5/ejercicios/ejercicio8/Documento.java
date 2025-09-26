
package tp5.ejercicios.ejercicio8;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Documento{

    // Atributos
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composicion (obligatoria)

    // Constructores
    public Documento(){}
    public Documento(String titulo, String contenido, FirmaDigital firma){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    // Getters/Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public FirmaDigital getFirma(){
        return firma;
    }
    public void setFirma(FirmaDigital firma){
        this.firma = firma;
    }

    // toString
    @Override
    public String toString(){
        return "Documento{titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + "}";
    }
}