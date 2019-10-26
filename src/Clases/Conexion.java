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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public void CargarAuditoria(DefaultTableModel Modelo) {

        try {
            String query = "select * from auditoria";
            connection = DriverManager.getConnection(this.url, this.username, this.password);
            Statement statement = (Statement) connection.createStatement();
            ResultSet rg = statement.executeQuery(query);
            while (rg.next()) {
                int id = rg.getInt("idaudioria");
                String nombre = rg.getString("audi_nombre");
                String fecha = rg.getString("audi_fecha");
                Object[] object = new Object[]{id, nombre, fecha};
                Modelo.addRow(object);
            }
            rg.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
        }

    }

}
