/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHIDORY
 */
public class TipoHabitacionData {
    
    private Connection connection = null;

    public TipoHabitacionData(Conexion conexion) {
        connection = conexion.getConexion();
    }
    
    public void guardarTipoH(TipoHabitacion tipoH){
        
        
        try {
            
            String sql = "INSERT INTO tipoHabitacion (tipo,codigo, cantPersonas,cantCamas,tipoCamas,precioNoche)"
                   + "VALUES ( ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement baseD = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            baseD.setString(1, tipoH.getTipo());
            baseD.setInt(2, tipoH.getCodigo());
            baseD.setInt(3, tipoH.getCantPersonas());
            baseD.setInt(4, tipoH.getCantCamas());
            baseD.setString(5, tipoH.getTipoCamas());
            baseD.setDouble(6, tipoH.getPrecioNoche());
            
            baseD.executeUpdate();
            ResultSet resultado = baseD.getGeneratedKeys();
            
            if (resultado.next()) {
                tipoH.setId(resultado.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el Tipo de Habitacion");
            }
            baseD.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar el tipo de habitacion: " + ex.getMessage());
        }
        
        
    }
    
    
    
}
