/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vasquez Emmanuel
 */
package com.mycompany.examen2ing;

public class Examen2ing {
    public static void main(String[] args) {

        SistemaObrasPublicas sistema = new SistemaObrasPublicas();

        Ciudadano c = new Ciudadano("Juan", "juan@mail.com", "1234");
        Bache b = new Bache(1, "A", "B", 10, "Centro", 5);

        sistema.registrarCiudadano(c);
        sistema.agregarBache(b);

        InformeRotura inf = sistema.generarInforme(b, c);

        PedidoObra pedido = inf.generarPedido();

        System.out.println("Sistema funcionando correctamente 🚀");
        System.out.println("Pedido generado en ubicación: " + pedido.getUbicacion());
    }
}

