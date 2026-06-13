/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */
public class Trabajador {

    private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador() {}

    public Trabajador(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = true;
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

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
}