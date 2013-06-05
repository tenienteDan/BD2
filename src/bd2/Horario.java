/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Alucard
 */
public class Horario {
private int CodigoH ;
private int CodigoPeli;
private int NumSala;
private int NumSucur;
private String Hora;
private String DATE;

    public Horario(int CodigoH, int CodigoPeli, int NumSala, int NumSucur, String Hora, String DATE) {
        this.CodigoH = CodigoH;
        this.CodigoPeli = CodigoPeli;
        this.NumSala = NumSala;
        this.NumSucur = NumSucur;
        this.Hora = Hora;
        this.DATE = DATE;
    }

    public int getCodigoH() {
        return CodigoH;
    }

    public void setCodigoH(int CodigoH) {
        this.CodigoH = CodigoH;
    }

    public int getCodigoPeli() {
        return CodigoPeli;
    }

    public void setCodigoPeli(int CodigoPeli) {
        this.CodigoPeli = CodigoPeli;
    }

    public int getNumSala() {
        return NumSala;
    }

    public void setNumSala(int NumSala) {
        this.NumSala = NumSala;
    }

    public int getNumSucur() {
        return NumSucur;
    }

    public void setNumSucur(int NumSucur) {
        this.NumSucur = NumSucur;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    @Override
    public String toString() {
        return "Horario{" + "CodigoH=" + CodigoH + ", CodigoPeli=" + CodigoPeli + ", NumSala=" + NumSala + ", NumSucur=" + NumSucur + ", Hora=" + Hora + ", DATE=" + DATE + '}';
    }

    


}
