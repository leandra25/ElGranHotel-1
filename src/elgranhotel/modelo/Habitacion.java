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
    private TipoHabitacion tipo ;
    private int contador;
    private boolean estado;

    public Habitacion(int id, Huesped huesped, TipoHabitacion tipo, boolean estado) {
        this.id = id;
        this.huesped = huesped;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Habitacion(Huesped huesped, TipoHabitacion tipo, boolean estado) {
        this.huesped = huesped;
        this.tipo = tipo;
        this.estado = estado;
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

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  

   

   
    
    
  
}
