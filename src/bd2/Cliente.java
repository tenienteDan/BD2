/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Cliente {
    private String rutC;
    private String nombre;

    public Cliente(String rutC, String nombre) {
        this.rutC = rutC;
        this.nombre = nombre;
    }

    public String getRutC() {
        return rutC;
    }

    public void setRutC(String rutC) {
        this.rutC = rutC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
