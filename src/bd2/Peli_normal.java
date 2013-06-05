/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Peli_normal extends Pelicula {
    private String resolucion;

    public Peli_normal(String resolucion, int codigo, String titulo, String director, String fecha_estreno, String duracion, String clasificacion) {
        super(codigo, titulo, director, fecha_estreno, duracion, clasificacion);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    
}
