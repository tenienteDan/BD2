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
public class Cli_frecuente extends Cliente {
     
     private Date Fecha_Nacimiento;
     private int Celular;

    public Cli_frecuente(Date Fecha_Nacimiento, int Celular, String rutC, String nombre) {
        super(rutC, nombre);
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Celular = Celular;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    

   

    

    
    
     
}
