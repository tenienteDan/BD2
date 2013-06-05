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
public class Empleado {
    
private String RutE;
private String Nombre ;
private Date Fecha_Nacimiento;
private String Fono;
private String Mail;
private String Direccion;
private String RutSupervisor;
private int NumSucursal;

    public Empleado(String RutE, String Nombre, Date Fecha_Nacimiento, String Fono, String Mail, String Direccion, String RutSupervisor, int NumSucursal) {
        this.RutE = RutE;
        this.Nombre = Nombre;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Fono = Fono;
        this.Mail = Mail;
        this.Direccion = Direccion;
        this.RutSupervisor = RutSupervisor;
        this.NumSucursal = NumSucursal;
    }

    public String getRutE() {
        return RutE;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public String getFono() {
        return Fono;
    }

    public String getMail() {
        return Mail;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getRutSupervisor() {
        return RutSupervisor;
    }

    public int getNumSucursal() {
        return NumSucursal;
    }

    @Override
    public String toString() {
        return "EMPLEADO{" + "RutE=" + RutE + ", Nombre=" + Nombre + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Fono=" + Fono + ", Mail=" + Mail + ", Direccion=" + Direccion + ", RutSupervisor=" + RutSupervisor + ", NumSucursal=" + NumSucursal + '}';
    }

    
}
