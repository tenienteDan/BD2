/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Sala_normal extends Sala{
    
    private String tipo_sonido;

    public Sala_normal(String tipo_sonido, int numeroSa, int numeroSu, int capacidad, int valor_entrada, String rut_encargado) {
        super(numeroSa, numeroSu, capacidad, valor_entrada, rut_encargado);
        this.tipo_sonido = tipo_sonido;
    }

 
    public String getTipo_sonido() {
        return tipo_sonido;
    }

    public void setTipo_sonido(String tipo_sonido) {
        this.tipo_sonido = tipo_sonido;
    }
    
    
    
}
