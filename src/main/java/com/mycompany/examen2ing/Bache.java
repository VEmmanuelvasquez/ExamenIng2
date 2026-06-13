/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */
public class Bache {

    private int id;
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;
    private int prioridad;
    private String estado = "SIN_REPARAR";

    public Bache() {}

    public Bache(int id, String calleA, String calleB, int altura, String barrio, int prioridad) {
        this.id = id;
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
        this.prioridad = prioridad;
    }

    public void marcarReparado() {
        this.estado = "REPARADO";
    }

    public boolean isReparado() {
        return estado.equals("REPARADO");
    }

    public int getId() {
        return id;
    }

    public String getCalleA() {
        return calleA;
    }

    public String getCalleB() {
        return calleB;
    }

    public int getAltura() {
        return altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }
    public String getUbicacion() {
    return calleA + " y " + calleB + " - " + altura + " - " + barrio;
    }
}