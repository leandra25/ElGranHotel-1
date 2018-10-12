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
public class Habitacion {
    private int id = -1;
    private Huesped huesped;
    private TipoHabitacion thabitacion;
    private boolean estado;

    public Habitacion(int id, Huesped huesped, TipoHabitacion thabitacion, boolean estado) {
        this.id = id;
        this.huesped = huesped;
        this.thabitacion = thabitacion;
        this.estado = estado;
    }

    public Habitacion(Huesped huesped, TipoHabitacion thabitacion, boolean estado) {
        this.huesped = huesped;
        this.thabitacion = thabitacion;
        this.estado = estado;
    }

    

    public Habitacion() {
    }
    
    public double calcularMonto(int cantDias){
        return thabitacion.getPrecioNoche() * cantDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public TipoHabitacion getThabitacion() {
        return thabitacion;
    }

    public void setThabitacion(TipoHabitacion thabitacion) {
        this.thabitacion = thabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    

   
    
}
