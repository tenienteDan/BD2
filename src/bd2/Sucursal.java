/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Sucursal {
   private int numeroSu;
   private String nombre;
   private String calle;
   private int numeroCalle;
   private String comuna;
   private String region;
   private String rut_encargado;

    public Sucursal(int numeroSu, String nombre, String calle, int numeroCalle, String comuna, String region, String rut_encargado) {
        this.numeroSu = numeroSu;
        this.nombre = nombre;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.comuna = comuna;
        this.region = region;
        this.rut_encargado = rut_encargado;
    }
   
   
    public int getNumeroSu() {
        return numeroSu;
    }

    public void setNumeroSu(int numeroSu) {
        this.numeroSu = numeroSu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRut_encargado() {
        return rut_encargado;
    }

    public void setRut_encargado(String rut_encargado) {
        this.rut_encargado = rut_encargado;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "numeroSu=" + numeroSu + ", nombre=" + nombre + ", calle=" + calle + ", numeroCalle=" + numeroCalle + ", comuna=" + comuna + ", region=" + region + ", rut_encargado=" + rut_encargado + '}';
    }
   
   
}
