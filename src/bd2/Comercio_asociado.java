/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Comercio_asociado {
  
     private int CodigoCA;
     private String Nombre;
     private String Rubro;
     private String RutAdmin;

    public Comercio_asociado(int CodigoCA, String Nombre, String Rubro, String RutAdmin) {
        this.CodigoCA = CodigoCA;
        this.Nombre = Nombre;
        this.Rubro = Rubro;
        this.RutAdmin = RutAdmin;
    }

    public int getCodigoCA() {
        return CodigoCA;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRubro() {
        return Rubro;
    }

    public String getRutAdmin() {
        return RutAdmin;
    }

    @Override
    public String toString() {
        return "COMERCIO_ASOCIADO{" + "CodigoCA=" + CodigoCA + ", Nombre=" + Nombre + ", Rubro=" + Rubro + ", RutAdmin=" + RutAdmin + '}';
    }
     
     
}
