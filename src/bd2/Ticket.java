package bd2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Andana
 */
public class Ticket {
    private int codigoT;
    private String hora_compra;
    private String fecha_compra;
    private int dcto_por_dia;
    private String rutCajero;

    public Ticket(int codigoT, String hora_compra, String fecha_compra, int dcto_por_dia, String rutCajero) {
        this.codigoT = codigoT;
        this.hora_compra = hora_compra;
        this.fecha_compra = fecha_compra;
        this.dcto_por_dia = dcto_por_dia;
        this.rutCajero = rutCajero;
    }
    
    
    public int getCodigoT() {
        return codigoT;
    }

    public void setCodigoT(int codigoT) {
        this.codigoT = codigoT;
    }

    public String getHora_compra() {
        return hora_compra;
    }

    public void setHora_compra(String hora_compra) {
        this.hora_compra = hora_compra;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getDcto_por_dia() {
        return dcto_por_dia;
    }

    public void setDcto_por_dia(int dcto_por_dia) {
        this.dcto_por_dia = dcto_por_dia;
    }

    public String getRutCajero() {
        return rutCajero;
    }

    public void setRutCajero(String rutCajero) {
        this.rutCajero = rutCajero;
    }

    @Override
    public String toString() {
        return "Ticket{" + "codigoT=" + codigoT + ", hora_compra=" + hora_compra + ", fecha_compra=" + fecha_compra + ", dcto_por_dia=" + dcto_por_dia + ", rutCajero=" + rutCajero + '}';
    }
    
    
}
