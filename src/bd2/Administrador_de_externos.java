
package bd2;

public class Administrador_de_externos {
    
    private String RutE;
    private String Nivel_Educacional;

    public Administrador_de_externos(String RutE, String Nivel_Educacional) {
        this.RutE = RutE;
        this.Nivel_Educacional = Nivel_Educacional;
    }

    public String getRutE() {
        return RutE;
    }

    public String getNivel_Educacional() {
        return Nivel_Educacional;
    }

    @Override
    public String toString() {
        return "ADMINISTRADOR_DE_EXTERNOS{" + "RutE=" + RutE + ", Nivel_Educacional=" + Nivel_Educacional + '}';
    }
    
    
    
}
