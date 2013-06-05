/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Turno {
    private int codigo;
    private String dia;
    private String h_Ent;
    private String h_Sal;

    public Turno(int codigo, String dia, String h_Ent, String h_Sal) {
        this.codigo = codigo;
        this.dia = dia;
        this.h_Ent = h_Ent;
        this.h_Sal = h_Sal;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getH_Ent() {
        return h_Ent;
    }

    public void setH_Ent(String h_Ent) {
        this.h_Ent = h_Ent;
    }

    public String getH_Sal() {
        return h_Sal;
    }

    public void setH_Sal(String h_Sal) {
        this.h_Sal = h_Sal;
    }

    @Override
    public String toString() {
        return "Turno{" + "codigo=" + codigo + ", dia=" + dia + ", h_Ent=" + h_Ent + ", h_Sal=" + h_Sal + '}';
    }
    
}
