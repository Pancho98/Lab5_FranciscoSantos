/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_francisicosantos;

import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Equipo {
    private String nombre;
    private int presupuesto;
    private int copas;
    private String Estadio;
    ArrayList<Jugador>jugadores = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, int presupuesto, int copas, String Estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas = copas;
        this.Estadio = Estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
