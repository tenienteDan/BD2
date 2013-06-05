/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Full_time {
   private String RutE;
   private int Honorario;

    public Full_time(String RutE, int Honorario) {
        this.RutE = RutE;
        this.Honorario = Honorario;
    }

    public String getRutE() {
        return RutE;
    }

    public int getHonorario() {
        return Honorario;
    }

    @Override
    public String toString() {
        return "FULL_TIME{" + "RutE=" + RutE + ", Honorario=" + Honorario + '}';
    }
   
   
}
