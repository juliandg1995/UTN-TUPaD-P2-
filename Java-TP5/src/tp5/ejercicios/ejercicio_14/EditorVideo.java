
package tp5.ejercicios.ejercicio_14;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class EditorVideo{

    // Constructores
    public EditorVideo(){}

    // toString
    @Override
    public String toString(){
        return "EditorVideo{}";
    }

    // Dependencia de creacion: crea Render y no lo conserva
    public void exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato, proyecto);
        System.out.println("Exportando: " + r);
    }
}