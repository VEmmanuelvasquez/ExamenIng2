/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */
import java.util.List;

public class Brigada {

    private int id;
    private String nombre;
    private List<Trabajador> trabajadores;
    private Trabajador jefe;
    private boolean libre = true;

    public Brigada() {}

    public Brigada(int id, String nombre, List<Trabajador> trabajadores, Trabajador jefe) {
        this.id = id;
        this.nombre = nombre;
        this.trabajadores = trabajadores;
        this.jefe = jefe;
    }

    public void ocupar() {
        this.libre = false;
    }

    public void liberar() {
        this.libre = true;
    }

    public boolean isLibre() {
        return libre;
    }

    public Trabajador getJefe() {
        return jefe;
    }

    public void setJefe(Trabajador jefe) {
        this.jefe = jefe;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }
}