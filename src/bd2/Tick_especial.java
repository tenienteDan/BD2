/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Tick_especial extends Ticket {

    private String rutC;
    private int codigoH;
    private int codigoPeli;
    private int numSala;
    private int munSucur;
    private String premiun;
    private String forma_compra;
    private int punto_sumado;

    public Tick_especial(String rutC, int codigoH, int codigoPeli, int numSala, int munSucur, String premiun, String forma_compra, int punto_sumado, int codigoT, String hora_compra, String fecha_compra, int dcto_por_dia, String rutCajero) {
        super(codigoT, hora_compra, fecha_compra, dcto_por_dia, rutCajero);
        this.rutC = rutC;
        this.codigoH = codigoH;
        this.codigoPeli = codigoPeli;
        this.numSala = numSala;
        this.munSucur = munSucur;
        this.premiun = premiun;
        this.forma_compra = forma_compra;
        this.punto_sumado = punto_sumado;
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

    public int getMunSucur() {
        return munSucur;
    }

    public void setMunSucur(int munSucur) {
        this.munSucur = munSucur;
    }

    public String getPremiun() {
        return premiun;
    }

    public void setPremiun(String premiun) {
        this.premiun = premiun;
    }

    public String getForma_compra() {
        return forma_compra;
    }

    public void setForma_compra(String forma_compra) {
        this.forma_compra = forma_compra;
    }

    public int getPunto_sumado() {
        return punto_sumado;
    }

    public void setPunto_sumado(int punto_sumado) {
        this.punto_sumado = punto_sumado;
    }
    
    
}
