package Entidades;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EquipoAcciones {
    
    public ArrayList<Equipo> cargarEquipos(){
        ArrayList<Equipo> equipos = new ArrayList<>();
        
        
        Conexion objetoConexion = new Conexion();
        Connection conexion = objetoConexion.getConexion();
        
        try {
            String sql = "SELECT * FROM equipo";
            
            Statement statement = conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            
            while (resultados.next()) {
                Equipo equipo_agregar = new Equipo();
                
                // Obtenemos los valores de nuestra DB
                equipo_agregar.setCodigo_equipo(resultados.getString("codigo_equipo"));
                equipo_agregar.setNombre_equipo(resultados.getString("nombre"));
                
                equipos.add(equipo_agregar);
            }
            
            statement.close();
            resultados.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return equipos;
    }
    
    
    public String agregarEquipo(Equipo equipo_agregar){
        String mensaje = "";
        try {
            String sql = "INSERT INTO equipo (codigo_equipo,nombre) "
                    + "VALUES (?, ?); ";
 
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, equipo_agregar.getCodigo_equipo());
            statement.setString(2, equipo_agregar.getNombre_equipo());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                mensaje = "El equipo fue agregado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se pudo agregar el equipo. Por favor revisar los datos";
        }
        
        return mensaje;
    }
    
    public String eliminarEquipo(String codigoEquipo){
        String mensaje = "";
        try {
            String sql = "DELETE FROM equipo WHERE codigo_equipo=?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigoEquipo);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                mensaje = "El equipo fue eliminado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "El equipo no se pudo eliminar";
        }
        
        return mensaje;
    }
    
    public String actualizarEquipo(Equipo equipoUpdate){
        String mensaje = "";

        try {
            String sql = "UPDATE equipo SET "
                    + "nombre = ?"
                    + " WHERE codigo_equipo = ?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, equipoUpdate.getNombre_equipo());
            statement.setString(2, equipoUpdate.getCodigo_equipo());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                mensaje = "Equipo actualizado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se puedo actualizar el equipo";
        }
        
        return mensaje;
    }
    
}
