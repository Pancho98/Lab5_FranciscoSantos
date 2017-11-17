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
    private int preio;
    private String Posicion;
    private boolean disponibilidad;
    private String habilidad;
    private String tecnica;
    private String resistencia;

    public Jugador() {
    }

    public Jugador(String nombre, int preio, String Posicion, boolean disponibilidad, String habilidad, String tecnica, String resistencia) {
        this.nombre = nombre;
        this.preio = preio;
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

    public int getPreio() {
        return preio;
    }

    public void setPreio(int preio) {
        this.preio = preio;
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
