package Entidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Conexion.Conexion;
import java.sql.PreparedStatement;

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
                jugadorAgregar.setEstatura(resultados.getDouble("estatura"));
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
    
    public ArrayList<Jugador> filtrarJugador(String id_universidad){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT * FROM jugador WHERE id_universidad = '" + id_universidad + "'";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                Jugador jugadorAgregar = new Jugador();
                
                //Asignacion de datos
                jugadorAgregar.setDui(resultados.getString("dui"));
                jugadorAgregar.setNombre(resultados.getString("nombre"));
                jugadorAgregar.setEdad(resultados.getInt("edad"));
                jugadorAgregar.setEstatura(resultados.getDouble("estatura"));
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
    
    public ArrayList<String> obtenerPosiciones(){
        ArrayList<String> posiciones = new ArrayList<>();
        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT * FROM posicion";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                String datos = resultados.getString("id_posicion");
                
                posiciones.add(datos);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return posiciones;
    }
    
    public String actualizarJugador(Jugador jugadorActualizar){
        String mensaje = "";

        try {
            String sql = "UPDATE jugador SET "
                    + "jugador.nombre = ? , jugador.edad = ? ,jugador.estatura = ? ,jugador.peso = ?, jugador.id_posicion = ?, jugador.id_universidad = ?"
                    + " WHERE jugador.dui = ?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, jugadorActualizar.getNombre());
            statement.setString(2, Integer.toString(jugadorActualizar.getEdad()));
            statement.setString(3, Double.toString(jugadorActualizar.getEstatura()));
            statement.setString(4, Double.toString(jugadorActualizar.getPeso()));
            statement.setString(5, jugadorActualizar.getId_posicion());
            statement.setString(6, jugadorActualizar.getId_universidad());
            statement.setString(7, jugadorActualizar.getDui());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                mensaje = "Usuario Actualizado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se puedo actualizar el usuario";
        }
        
        return mensaje;
    }
    
    public String agregarJugador(Jugador jugadorAdd){
        String mensaje = "";
        try {
            String sql = "INSERT INTO jugador "
                        + "(dui, nombre, edad, estatura,peso, id_posicion, id_universidad) "
                        + "VALUES (?,?,?,?,?,?,?);";
 
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, jugadorAdd.getDui());
            statement.setString(2, jugadorAdd.getNombre());
            statement.setString(3, Integer.toString(jugadorAdd.getEdad()));
            statement.setString(4, Double.toString(jugadorAdd.getEstatura()));
            statement.setString(5, Double.toString(jugadorAdd.getPeso()));
            statement.setString(6, jugadorAdd.getId_posicion());
            statement.setString(7, jugadorAdd.getId_universidad());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                mensaje = "El jugador fue agregado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se pudo agregar el jugador. Por favor revisar los datos";
        }
        
        return mensaje;
    }
    
    public String eliminarJugador(String dui){
        String mensaje = "";
        try {
            String sql = "DELETE FROM jugador WHERE jugador.dui=?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, dui);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                mensaje = "El usuario fue eliminado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "El usuario no se pudo eliminar";
        }
        
        return mensaje;
    }
    
    public int cantidadJugador(String id_universidad){
        
        int cantidad = 0;        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT "
                    + "COUNT(jugador.nombre) AS cantidad_jugadores FROM jugador "
                    + "WHERE jugador.id_universidad = '"+id_universidad+"'";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                cantidad = resultados.getInt(1);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return cantidad;
    }
    
    public int cantidadPerPosicion(String id_universidad , String id_posicion){
        
        int cantidad = 0;        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT "
                        + "COUNT(jugador.dui) AS cantidad "
                        + "FROM jugador"
                        + " WHERE jugador.id_universidad = '"+id_universidad+"' AND jugador.id_posicion = '"+id_posicion+"'";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                cantidad = resultados.getInt(1);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return cantidad;
    }
}
