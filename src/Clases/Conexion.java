/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author nain
 */
public class Conexion {

    private String url = "jdbc:mysql://localhost:3306/auditoria";
    private String username = "root";
    private String password = "";
    private Connection connection;

    public Conexion() {
        
    }

    public boolean Insertar(String query) {
        boolean rs = true;
        try {

            connection = DriverManager.getConnection(this.url, this.username, this.password);
            Statement statement = (Statement) connection.createStatement();
            rs = statement.execute(query);
            statement.close();
            connection.close();
           
        } catch (SQLException ex) {
            System.out.println(ex);
            
        }
        return rs;
        
    }
    
    private void buscar(){
                
            System.out.println("sasdd");
//            while (rs.next()) {
//
//                int id = rs.getInt("usu_documento");
//                String nombre = rs.getString("usu_nombres");
//                String apellido = rs.getString("usu_apellidos");
//
//                System.out.println(String.format("%d, %s %s", id, nombre, apellido));
//            }

           
    
    }

}
