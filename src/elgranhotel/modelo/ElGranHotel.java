/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHIDORY
 */
public class ElGranHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fechaE = "05/10/2018";
        String fechaS = "30/10/2018";
        
        LocalDate fEntrada = LocalDate.parse(fechaE, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fSalida = LocalDate.parse(fechaS, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //ArrayList<TipoHabitacion> tipo = new ArrayList<TipoHabitacion>();

        Huesped persona1 = new Huesped(1,"martin avallar", 32247315, "venezuela 379", "kasmex777@gmail.com");
        TipoHabitacion tipoH = new TipoHabitacion("standar simple", 0025, 2, 2, "simple", 200.0);
        //tipo.add(tipoH);
        
        //Habitacion habi = new Habitacion(persona1, tipoH, 20, true);
        
        //Reservas reserva1 = new Reservas(persona1, habi, 2, fEntrada, fSalida,250.0);
        
        //tipo.forEach(action -> {System.out.println(habi.getThabitacion());} );
        
        
        //for(int i = 0;i < tipo.size();i++){
            
            
           /*System.out.println(tipoH.getTipo());
            System.out.println(tipoH.getCantCamas());
            System.out.println(tipoH.getCodigo());
            System.out.println(tipoH.getPrecioNoche());
            System.out.println(tipoH.getTipoCamas());*/
        //}
        
       
    }
    
}
