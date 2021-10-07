package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static final String url = "jdbc:mysql://localhost:3306/labpoe_torneo";
    public static final String user = "root";
    public static final String password = "";
     
    public Connection getConexion(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }

}
