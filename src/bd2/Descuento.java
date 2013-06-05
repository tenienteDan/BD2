/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import java.util.Date;

public class Descuento {
    
private int  CodigoD;
private int  CodigoCA;
private String RutCliente ;
private double Porcentaje;
private Date Fecha_Inicio;
private int  Duracion;

    public Descuento(int CodigoD, int CodigoCA, String RutCliente, double Porcentaje, Date Fecha_Inicio, int Duracion) {
        this.CodigoD = CodigoD;
        this.CodigoCA = CodigoCA;
        this.RutCliente = RutCliente;
        this.Porcentaje = Porcentaje;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Duracion = Duracion;
    }

    public int getCodigoD() {
        return CodigoD;
    }

    public int getCodigoCA() {
        return CodigoCA;
    }

    public String getRutCliente() {
        return RutCliente;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public int getDuracion() {
        return Duracion;
    }

    @Override
    public String toString() {
        return "DESCUENTO{" + "CodigoD=" + CodigoD + ", CodigoCA=" + CodigoCA + ", RutCliente=" + RutCliente + ", Porcentaje=" + Porcentaje + ", Fecha_Inicio=" + Fecha_Inicio + ", Duracion=" + Duracion + '}';
    }

  
}
