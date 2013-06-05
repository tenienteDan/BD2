/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Encargado_sala {
    private String RutE;

    public Encargado_sala(String RutE) {
        this.RutE = RutE;
    }

    public String getRutE() {
        return RutE;
    }

    @Override
    public String toString() {
        return "ENCARGADO_SALA{" + "RutE=" + RutE + '}';
    }
    
    
}
