
package tp5.ejercicios.ejercicio1;

/**
 *
 * @author Julian Daniel Gómez <https://github.com/juliandg1995>
 */

public class Foto{
    private String imagen;
    private String formato; // JPG/PNG

    public Foto(){}

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen(){
        return imagen;
    }
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
}
