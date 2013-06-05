/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Peli_3d extends Pelicula {
    private String espacio_de_colores;

    public Peli_3d(String espacio_de_colores, int codigo, String titulo, String director, String fecha_estreno, String duracion, String clasificacion) {
        super(codigo, titulo, director, fecha_estreno, duracion, clasificacion);
        this.espacio_de_colores = espacio_de_colores;
    }

    public String getEspacio_de_colores() {
        return espacio_de_colores;
    }

    public void setEspacio_de_colores(String espacio_de_colores) {
        this.espacio_de_colores = espacio_de_colores;
    }
    
    
    
}
