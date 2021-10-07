package Entidades;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    
    public String agregarJugador(Universidad universidadAdd){
        String mensaje = "";
        try {
            String sql = "INSERT INTO universidad (codigo_universidad,nombre) "
                    + "VALUES (?, ?); ";
 
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, universidadAdd.getId_universidad());
            statement.setString(2, universidadAdd.getNombre_universidad());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                mensaje = "La uinversidad fue agregado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se pudo agregar la universidad. Por favor revisar los datos";
        }
        
        return mensaje;
    }
    
    public String eliminarUniversidad(String codigoUniversidad){
        String mensaje = "";
        try {
            String sql = "DELETE FROM universidad WHERE universidad.codigo_universidad=?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigoUniversidad);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                mensaje = "La universidad fue eliminado exitosamente";
            }
        } catch (Exception e) {
            mensaje = "La universidad no se pudo eliminar";
        }
        
        return mensaje;
    }
    
    public String actualizarUniversidad(Universidad universidadUpdate){
        String mensaje = "";

        try {
            String sql = "UPDATE universidad SET "
                    + "nombre = ?"
                    + " WHERE codigo_universidad = ?";
            
            Conexion objetoConexion = new Conexion();
            Connection conexion = objetoConexion.getConexion();
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, universidadUpdate.getNombre_universidad());
            statement.setString(2, universidadUpdate.getId_universidad());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                mensaje = "Universidad actualizada exitosamente";
            }
        } catch (Exception e) {
            mensaje = "No se puedo actualizar la universidad";
        }
        
        return mensaje;
    }
    
}
