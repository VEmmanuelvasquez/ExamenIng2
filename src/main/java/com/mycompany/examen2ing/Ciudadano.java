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
    private String password;

    public Ciudadano() {}

    public Ciudadano(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public boolean validarIngreso(String psw) {
        return this.password.equals(psw);
    }

    public void cambioPassword(String newPass) {
        this.password = newPass;
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        return !this.equals(c2);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }
}