/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Pelicula {
    private int codigo;
    private String titulo;
    private String director;
    private String fecha_estreno;
    private String duracion;
    private String clasificacion;

    public Pelicula(int codigo, String titulo, String director, String fecha_estreno, String duracion, String clasificacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.fecha_estreno = fecha_estreno;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", titulo=" + titulo + ", director=" + director + ", fecha_estreno=" + fecha_estreno + ", duracion=" + duracion + ", clasificacion=" + clasificacion + '}';
    }
    
    
}
