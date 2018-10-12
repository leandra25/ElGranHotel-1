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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHIDORY
 */
public class HuespedData {
    private Connection connection = null;

    public HuespedData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
            System.out.println("Conexion Establecida con exito!!!");
            
            
        } catch (Exception e) {
            System.out.println("Error al obtener la conexion");
        }
        
    }

   public void guardarHuesped(Huesped huesped){
       
            
       
               try {
                   
            String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo) VALUES ( ? , ? , ?, ? );";
                   
            PreparedStatement guardar = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            guardar.setString(1, huesped.getNombre());
            guardar.setInt(2, huesped.getDni());
            guardar.setString(3, huesped.getDomicilio());
            guardar.setString(4, huesped.getCorreo());
            
            guardar.executeQuery();
            
            ResultSet resul = guardar.getGeneratedKeys();
            
            if (resul.next()) {
                huesped.setId(resul.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un huesped");
            }
            guardar.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
   }
   
   public Huesped buscarHuesped(int id){
         Huesped huesped = null;
    
    
    try {
            
            String sql = "SELECT * FROM huesped WHERE id =?;";

            PreparedStatement baseD = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            baseD.setInt(1, id);
           
            
            ResultSet resultado = baseD.executeQuery();
            
            while(resultado.next()){
                huesped = new Huesped();
                huesped.setId(resultado.getInt("id_huesped"));
                huesped.setNombre(resultado.getString("nombre"));
                huesped.setDni(resultado.getInt("dni"));
                huesped.setDomicilio(resultado.getString("domicilio"));
                huesped.setCorreo(resultado.getString("correo"));

                
            }      
            baseD.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un huesped: " + ex.getMessage());
        }
        
        return huesped;
    }
   
   public void actualizarHuesped(Huesped huesped){
      
                try {
            
            String sql = "UPDATE huesped SET nombre = ?, dni = ?, domicilio = ?, correo = ?;";
            
            PreparedStatement datos = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            datos.setString(1, huesped.getNombre());
            datos.setInt(2, huesped.getDni());
            datos.setString(3, huesped.getDomicilio());
            datos.setString(4, huesped.getCorreo());
            
            datos.executeUpdate();
            datos.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un huesped: " + ex.getMessage());
        }
   }
   
   public void borrarHuesped(int id){
    try {
            
            String sql = "DELETE FROM huesped WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un huesped: " + ex.getMessage());
        }
        
    
    }
   
}
