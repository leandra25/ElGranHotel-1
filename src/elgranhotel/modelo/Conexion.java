/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHIDORY
 */
public class Conexion {
    private String url;
    private String usuario;
    private String password;
    
    private Connection conexion;

    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        
         Class.forName("org.mariadb.jdbc.Driver");
    }
    
    public Connection getConexion() {
        if(conexion == null){
            try {
               
                conexion = DriverManager.getConnection(url, usuario, password);
                
            } catch (SQLException ex) {
                System.out.println("La conexion esta no esta establecida");
            }
        }
        return conexion;
    } 
    
   
    
}
