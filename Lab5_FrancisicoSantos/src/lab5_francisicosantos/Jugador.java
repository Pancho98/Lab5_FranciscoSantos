/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_francisicosantos;

/**
 *
 * @author Francisco Santos
 */
public class Jugador {
    private String nombre;
    private int precio;
    private String Posicion;
    private boolean disponibilidad;
    private String habilidad;
    private String tecnica;
    private String resistencia;

    public Jugador() {
    }

    public Jugador(String nombre, int precio, String Posicion, boolean disponibilidad, String habilidad, String tecnica, String resistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.Posicion = Posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
