/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import java.util.Date;

/**
 *
 * @author Alucard
 */
public class Cliente_compra_produc {
    private String RutCliente;
    private int NumProducto;
    private Date Fecha;

    public Cliente_compra_produc(String RutCliente, int NumProducto, Date Fecha) {
        this.RutCliente = RutCliente;
        this.NumProducto = NumProducto;
        this.Fecha = Fecha;
    }

    public String getRutCliente() {
        return RutCliente;
    }

    public int getNumProducto() {
        return NumProducto;
    }

    public Date getFecha() {
        return Fecha;
    }

    @Override
    public String toString() {
        return "CLIENTE_COMPRA_PRODUC{" + "RutCliente=" + RutCliente + ", NumProducto=" + NumProducto + ", Fecha=" + Fecha + '}';
    }
    
}
