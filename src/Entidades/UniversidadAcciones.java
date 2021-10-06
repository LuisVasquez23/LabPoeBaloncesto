package Entidades;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UniversidadAcciones {
    
    public ArrayList<Universidad> cargarUniversidades(){
        ArrayList<Universidad> universidades = new ArrayList<>();
        
        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT * FROM universidad";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                Universidad universidadAgregar = new Universidad();
                
                universidadAgregar.setId_universidad(resultados.getString("codigo_universidad"));
                universidadAgregar.setNombre_universidad(resultados.getString("nombre"));
                
                universidades.add(universidadAgregar);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return universidades;
    }
    
}
