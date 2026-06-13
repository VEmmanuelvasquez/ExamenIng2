/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */

import java.util.*;
import com.mycompany.examen2ing.*;

public class SistemaObrasPublicas {

    private List<Ciudadano> ciudadanos = new ArrayList<>();
    private List<Bache> baches = new ArrayList<>();
    private List<InformeRotura> informes = new ArrayList<>();
    private List<PedidoObra> pedidos = new ArrayList<>();
    private List<Brigada> brigadas = new ArrayList<>();

    public Ciudadano buscarCiudadano(String email) {
        return ciudadanos.stream()
                .filter(c -> c.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public void registrarCiudadano(Ciudadano c) {
        if (buscarCiudadano(c.getEmail()) == null) {
            ciudadanos.add(c);
        }
    }

    public void agregarBache(Bache b) {
        baches.add(b);
    }

    public InformeRotura generarInforme(Bache b, Ciudadano c) {
        int id = informes.size() + 1;
        InformeRotura i = new InformeRotura(id, "bache detectado", 3, b, c);
        informes.add(i);
        return i;
    }

    public void agregarBrigada(Brigada b) {
        brigadas.add(b);
    }

    public void agregarPedido(PedidoObra p) {
        pedidos.add(p);
    }
}