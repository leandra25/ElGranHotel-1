/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHIDORY
 */
public class ReservasData {
    
    private Connection connection = null;

    public ReservasData(Conexion conexion) {
        connection = conexion.getConexion();
    }
    
    public void guardarReservas(Reservas reservas){
        
        try {
            
     String sql = "INTSERT INTO reservas (id_huesped, id_habitacion, cantPersonas, fechaEntrada, fechaSalida, importeTotal)"
                    + "VALUES ( ?, ?, ?, ?, ?, ? );";
            
            PreparedStatement baseD = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            baseD.setInt(1, reservas.getHuesped().getId());
            baseD.setInt(2, reservas.getHabitaciones().getId());
            baseD.setInt(3, reservas.getCantPersonas());
            baseD.setDate(4, Date.valueOf(reservas.getFechaEntrada()));
            baseD.setDate(5, Date.valueOf(reservas.getFechaSalida()));
            baseD.setDouble(6, reservas.getImporteTotal());
            
            baseD.executeUpdate();
            ResultSet resultado = baseD.getGeneratedKeys();
            
            if (resultado.next()) {
                reservas.setId(resultado.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una reserva");
            }
             baseD.close();
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }
    
    
    
    
}
