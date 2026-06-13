/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.examen2ing;

/**
 *
 * @author Vasquez Emmanuel
 */
public class Ciudadano {
    private String nombre;
    private String email;
    private int password;

    public Ciudadano() {}

    public Ciudadano(String nombre, String email, int password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public boolean validarIngreso(int psw) {
        return this.password == psw;
    }

    public void cambioPassword(String newPass) {
        this.password = Integer.parseInt(newPass);
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        return !this.email.equals(c2.email);
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}