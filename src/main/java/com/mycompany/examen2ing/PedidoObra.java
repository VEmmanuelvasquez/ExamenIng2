/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */
import java.time.LocalDate;

public class PedidoObra {

    private int nro;
    private String ubicacion;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private Brigada brigada;
    private String observaciones;

    public PedidoObra() {}

    public PedidoObra(int nro, Bache b, String observaciones) {
        this.nro = nro;
        this.fechaCreacion = LocalDate.now();
        this.fechaReparacion = LocalDate.now().plusDays(7);
        this.ubicacion = b.getUbicacion(); 
        this.observaciones = observaciones;
    }

    public void asignarBrigada(Brigada b) {
        this.brigada = b;
    }

    public int getNro() {
        return nro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }
}