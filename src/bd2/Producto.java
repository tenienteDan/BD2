/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

/**
 *
 * @author Javier Andana
 */
public class Producto {
    private int numero;
    private String nombre;
    private String categoria;
    private int valor_en_pesos;
    private int valor_en_puntos;
    private int codigoCA;

    public Producto(int numero, String nombre, String categoria, int valor_en_pesos, int valor_en_puntos, int codigoCA) {
        this.numero = numero;
        this.nombre = nombre;
        this.categoria = categoria;
        this.valor_en_pesos = valor_en_pesos;
        this.valor_en_puntos = valor_en_puntos;
        this.codigoCA = codigoCA;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getValor_en_pesos() {
        return valor_en_pesos;
    }

    public void setValor_en_pesos(int valor_en_pesos) {
        this.valor_en_pesos = valor_en_pesos;
    }

    public int getValor_en_puntos() {
        return valor_en_puntos;
    }

    public void setValor_en_puntos(int valor_en_puntos) {
        this.valor_en_puntos = valor_en_puntos;
    }

    public int getCodigoCA() {
        return codigoCA;
    }

    public void setCodigoCA(int codigoCA) {
        this.codigoCA = codigoCA;
    }

    @Override
    public String toString() {
        return "Producto{" + "numero=" + numero + ", nombre=" + nombre + ", categoria=" + categoria + ", valor_en_pesos=" + valor_en_pesos + ", valor_en_puntos=" + valor_en_puntos + ", codigoCA=" + codigoCA + '}';
    }
    
    
}
