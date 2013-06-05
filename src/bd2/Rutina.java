/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Rutina {
    private String rutE;
    private String actividad;

    public Rutina(String rutE, String actividad) {
        this.rutE = rutE;
        this.actividad = actividad;
    }

    public String getRutE() {
        return rutE;
    }

    public void setRutE(String rutE) {
        this.rutE = rutE;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Rutina{" + "rutE=" + rutE + ", actividad=" + actividad + '}';
    }
    
    
}
