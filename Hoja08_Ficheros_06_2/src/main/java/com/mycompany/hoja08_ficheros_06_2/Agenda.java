/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_06_2;

import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Agenda {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    Scanner teclado = new Scanner(System.in);
    File fichero = new File("D:\\Usuarios\\DAM106\\Downloads\\agenda.dat");

    public Agenda(String nombre, String telefono, String direccion, String codigoPostal) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    private boolean comprobarTelefono(String telefono) {

        if (telefono.length() == 9) {

            return true;
        }
        return false;
    }

    public void aniadir() {

        ObjectOutputStream fo = null;
        
        try {
            if (!fichero.exists()) {
                if (fichero.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
           
        }

    }

}
