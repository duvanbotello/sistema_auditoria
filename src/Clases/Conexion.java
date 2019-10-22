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

    public Conexion() {
        try {

            String url = "jdbc:mysql://localhost:3306/asesoria";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = (Statement) connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM usuario");

            while (rs.next()) {

                int id = rs.getInt("usu_documento");
                String nombre = rs.getString("usu_nombres");
                String apellido = rs.getString("usu_apellidos");
               
                System.out.println(String.format("%d, %s %s", id, nombre, apellido));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
