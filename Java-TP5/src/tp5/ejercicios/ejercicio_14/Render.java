
package tp5.ejercicios.ejercicio_14;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Render{

    // Atributos
    private String formato;
    private Proyecto proyecto; // asociacion unidireccional

    // Constructores
    public Render(){}
    public Render(String formato, Proyecto proyecto){
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters/Setters
    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public Proyecto getProyecto(){
        return proyecto;
    }
    public void setProyecto(Proyecto proyecto){
        this.proyecto = proyecto;
    }

    // toString
    @Override
    public String toString(){
        return "Render{formato=" + formato + ", proyecto=" + proyecto + "}";
    }
}