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

public class InformeRotura {

    private int codInf;
    private LocalDate fecha;
    private String problema;
    private int urgencia;
    private Bache bache;
    private Ciudadano ciudadano;
    private PedidoObra pedido;

    public InformeRotura() {}

    public InformeRotura(int codInf, String problema, int urgencia,
                         Bache bache, Ciudadano ciudadano) {
        this.codInf = codInf;
        this.fecha = LocalDate.now();
        this.problema = problema;
        this.urgencia = urgencia;
        this.bache = bache;
        this.ciudadano = ciudadano;
    }

    public PedidoObra generarPedido() {
        this.pedido = new PedidoObra(1, bache, "Generado desde informe");
        return pedido;
    }

    public int getCodInf() {
        return codInf;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getProblema() {
        return problema;
    }

    public int getUrgencia() {
        return urgencia;
    }

    public Bache getBache() {
        return bache;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public PedidoObra getPedido() {
        return pedido;
    }
}