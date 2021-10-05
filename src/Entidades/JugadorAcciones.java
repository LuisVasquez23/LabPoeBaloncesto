package Entidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Conexion.Conexion;

public class JugadorAcciones {
    
    public ArrayList<Jugador> cargarDatos(){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT * FROM jugador";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                Jugador jugadorAgregar = new Jugador();
                
                //Asignacion de datos
                jugadorAgregar.setDui(resultados.getString("dui"));
                jugadorAgregar.setNombre(resultados.getString("nombre"));
                jugadorAgregar.setEdad(resultados.getInt("edad"));
                jugadorAgregar.setPeso(resultados.getDouble("peso"));
                jugadorAgregar.setId_posicion(resultados.getString("id_posicion"));
                jugadorAgregar.setId_universidad(resultados.getString("id_universidad"));
                
                jugadores.add(jugadorAgregar);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return jugadores;
    }
}
