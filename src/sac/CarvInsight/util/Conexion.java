/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.CarvInsight.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conexion = null;
    private String usuario;
    private String password;
    private String basedatos;
    private String URL;
    private String driver;

    private Conexion() {
        usuario = "root";
        password = "12345678";
        basedatos = "oee_carvimsa";
        URL = "jdbc:mysql://localhost:3306/oee_carvimsa?zeroDateTimeBehavior=CONVERT_TO_NULL";
        driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(URL, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            new Conexion();
        }
        return conexion;
    }
}
