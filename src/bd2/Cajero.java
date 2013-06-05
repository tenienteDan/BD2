/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Cajero {
    
    private String RutE;
    private String Antecedentes;

    public Cajero(String RutE, String Antecedentes) {
        this.RutE = RutE;
        this.Antecedentes = Antecedentes;
    }

    public String getRutE() {
        return RutE;
    }

    public String getAntecedentes() {
        return Antecedentes;
    }

    @Override
    public String toString() {
        return "CAJERO{" + "RutE=" + RutE + ", Antecedentes=" + Antecedentes + '}';
    }
    
}
