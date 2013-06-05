/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import java.util.Date;

/**
 *
 * @author Javier Andana
 */
public class Part_time extends Empleado {
    //esperar la clase empleado
    private int honorario_por_hora;

    public Part_time(int honorario_por_hora, String RutE, String Nombre, Date Fecha_Nacimiento, String Fono, String Mail, String Direccion, String RutSupervisor, int NumSucursal) {
        super(RutE, Nombre, Fecha_Nacimiento, Fono, Mail, Direccion, RutSupervisor, NumSucursal);
        this.honorario_por_hora = honorario_por_hora;
    }

    public int getHonorario_por_hora() {
        return honorario_por_hora;
    }

    public void setHonorario_por_hora(int honorario_por_hora) {
        this.honorario_por_hora = honorario_por_hora;
    }

    
    
}
