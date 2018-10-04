/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

/**
 *
 * @author CHIDORY
 */
public class TipoHabitacion {
    private int id = -1;
    private String tipo;
    private int codigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCamas;
    private double precioNoche;

    public TipoHabitacion(int id, String tipo, int codigo, int cantPersonas, int cantCamas, String tipoCamas, double precioNoche) {
        this.id = id;
        this.tipo = tipo;
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion(String tipo, int codigo, int cantPersonas, int cantCamas, String tipoCamas, double precioNoche) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
    
    
}
