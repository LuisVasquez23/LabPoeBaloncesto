package Entidades;

public class Jugador {
    private String dui;
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private String id_posicion;
    private String id_universidad;
    
    // Metodos getter

    public String getDui() {
        return dui;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getId_posicion() {
        return id_posicion;
    }

    public String getId_universidad() {
        return id_universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
    
    // Metodos setter

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setId_posicion(String id_posicion) {
        this.id_posicion = id_posicion;
    }

    public void setId_universidad(String id_universidad) {
        this.id_universidad = id_universidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
