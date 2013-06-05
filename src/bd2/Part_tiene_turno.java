/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Part_tiene_turno {
    private String RutE ;
     private int CodigoTurno;

    public Part_tiene_turno(String RutE, int CodigoTurno) {
        this.RutE = RutE;
        this.CodigoTurno = CodigoTurno;
    }

    public String getRutE() {
        return RutE;
    }

    public void setRutE(String RutE) {
        this.RutE = RutE;
    }

    public int getCodigoTurno() {
        return CodigoTurno;
    }

    public void setCodigoTurno(int CodigoTurno) {
        this.CodigoTurno = CodigoTurno;
    }

    @Override
    public String toString() {
        return "Part_tiene_turno{" + "RutE=" + RutE + ", CodigoTurno=" + CodigoTurno + '}';
    }

    
     
}
