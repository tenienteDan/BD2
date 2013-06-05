/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Sala {

    private int numeroSa;
    private int numeroSu;
    private int capacidad;
    private int valor_entrada;
    private String rut_encargado;

    public Sala(int numeroSa, int numeroSu, int capacidad, int valor_entrada, String rut_encargado) {
        this.numeroSa = numeroSa;
        this.numeroSu = numeroSu;
        this.capacidad = capacidad;
        this.valor_entrada = valor_entrada;
        this.rut_encargado = rut_encargado;
    }

    public int getNumeroSa() {
        return numeroSa;
    }

    public void setNumeroSa(int numeroSa) {
        this.numeroSa = numeroSa;
    }

    public int getNumeroSu() {
        return numeroSu;
    }

    public void setNumeroSu(int numeroSu) {
        this.numeroSu = numeroSu;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getValor_entrada() {
        return valor_entrada;
    }

    public void setValor_entrada(int valor_entrada) {
        this.valor_entrada = valor_entrada;
    }

    public String getRut_encargado() {
        return rut_encargado;
    }

    public void setRut_encargado(String rut_encargado) {
        this.rut_encargado = rut_encargado;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroSa=" + numeroSa + ", numeroSu=" + numeroSu + ", capacidad=" + capacidad + ", valor_entrada=" + valor_entrada + ", rut_encargado=" + rut_encargado + '}';
    }
    
    
}
