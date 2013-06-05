/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Sala_3d extends Sala {

    private int num_lentes;

    public Sala_3d(int num_lentes, int numeroSa, int numeroSu, int capacidad, int valor_entrada, String rut_encargado) {
        super(numeroSa, numeroSu, capacidad, valor_entrada, rut_encargado);
        this.num_lentes = num_lentes;
    }

    public int getNum_lentes() {
        return num_lentes;
    }

    public void setNum_lentes(int num_lentes) {
        this.num_lentes = num_lentes;
    }

   
}
