/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Tick_normal extends Ticket {
    private String rutC;
    private int codigoH;
    private int codigoPeli;
    private int numSala;
    private int numSucur;

    public Tick_normal(String rutC, int codigoH, int codigoPeli, int numSala, int codigoT, String hora_compra, String fecha_compra, int dcto_por_dia, String rutCajero) {
        super(codigoT, hora_compra, fecha_compra, dcto_por_dia, rutCajero);
        this.rutC = rutC;
        this.codigoH = codigoH;
        this.codigoPeli = codigoPeli;
        this.numSala = numSala;
    }

    public String getRutC() {
        return rutC;
    }

    public void setRutC(String rutC) {
        this.rutC = rutC;
    }

    public int getCodigoH() {
        return codigoH;
    }

    public void setCodigoH(int codigoH) {
        this.codigoH = codigoH;
    }

    public int getCodigoPeli() {
        return codigoPeli;
    }

    public void setCodigoPeli(int codigoPeli) {
        this.codigoPeli = codigoPeli;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getNumSucur() {
        return numSucur;
    }

    public void setNumSucur(int numSucur) {
        this.numSucur = numSucur;
    }
    
    
}
