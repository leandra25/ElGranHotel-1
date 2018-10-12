/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHIDORY
 */
public class HabitacionData {
    private Connection connection = null;

    public HabitacionData(Conexion conexion) {
        
        connection = conexion.getConexion();
    }
    
    public void guardarHabitacion(Habitacion habitacion){
        
        
        try {
                    String sql = "INSERT INTO habitacion (id_huesped, id_habitacion, estado) VALUES ( ?, ?, ? );";

            PreparedStatement baseD = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            baseD.setInt(1, habitacion.getThabitacion().getId());
            baseD.setInt(2, habitacion.getThabitacion().getId());
            baseD.setBoolean(3, habitacion.isEstado());
            
            baseD.executeUpdate();
            
            ResultSet resultado = baseD.getGeneratedKeys();
            
            if (resultado.next()) {
                habitacion.setId(resultado.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la habitacion");
            }
            baseD.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar la habitacion: " + ex.getMessage());
        }
    }
    
    /*public List<Habitacion> obtenerHabitacion(){
        List<Habitacion> habitaciones = new ArrayList<>();
        
        
        try {
            
            String sql = "SELECT * FROM huesped ;";
        PreparedStatement baseD = connection.prepareStatement(sql);
         ResultSet resultado = baseD.executeQuery();
         Habitacion habitacion;
         
         while(resultado.next()){
             habitacion = new Habitacion();
             habitacion.setId(resultado.getInt("id_habitacion"));
             
             
             
         }
         
         
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        return;
        
    }*/
    
    
}
