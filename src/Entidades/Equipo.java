package Entidades;

public class Equipo {
    private String codigo_equipo;
    private String nombre_equipo;

    public Equipo() {
        codigo_equipo = "";
        nombre_equipo = "";
    }
    
    // Metodos getter

    public String getCodigo_equipo() {
        return codigo_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }
    
    // Metodos setter

    public void setCodigo_equipo(String codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }
    
    
}
