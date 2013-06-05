/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Alucard
 */
public class Encargado_sucursal {
private String RutE;
private int Oficina;
private int Fono_Fijo;
private String Profesión;

    public Encargado_sucursal(String RutE, int Oficina, int Fono_Fijo, String Profesión) {
        this.RutE = RutE;
        this.Oficina = Oficina;
        this.Fono_Fijo = Fono_Fijo;
        this.Profesión = Profesión;
    }

    public String getRutE() {
        return RutE;
    }

    public void setRutE(String RutE) {
        this.RutE = RutE;
    }

    public int getOficina() {
        return Oficina;
    }

    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }

    public int getFono_Fijo() {
        return Fono_Fijo;
    }

    public void setFono_Fijo(int Fono_Fijo) {
        this.Fono_Fijo = Fono_Fijo;
    }

    public String getProfesión() {
        return Profesión;
    }

    public void setProfesión(String Profesión) {
        this.Profesión = Profesión;
    }

    @Override
    public String toString() {
        return "Encargado_sucursal{" + "RutE=" + RutE + ", Oficina=" + Oficina + ", Fono_Fijo=" + Fono_Fijo + ", Profesi\u00f3n=" + Profesión + '}';
    }

    
}
