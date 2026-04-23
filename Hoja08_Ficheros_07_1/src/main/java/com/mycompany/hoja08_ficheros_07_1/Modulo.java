/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_07_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DAM106
 */
public class Modulo {

    private String nombreModulo;
    private List<Alumno> listaAlumnos;

    public Modulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.listaAlumnos = new ArrayList<>();
    }

    public void añadirAlumno() {

        if (listaAlumnos.add(new Alumno())) {
            System.out.println("Alumno añadido correctamente");

        } else {
            System.out.println("No se ha podido añadir");
        }

    }

    public void mostrarInverso() {
        for (int i = listaAlumnos.size() - 1; i >= 0; i--) {
            Alumno a = listaAlumnos.get(i);
            System.out.println(a.getNombreAlumno().charAt(0) + " " + a.getNota());

        }

    }

    public void grabarNombres() throws IOException {
        
        try (BufferedWriter bwAprobados = new BufferedWriter(new FileWriter("Aprobados.txt")); BufferedWriter bwSuspensos = new BufferedWriter(new FileWriter("Suspensos.txt"))) {

            for (Alumno a : listaAlumnos) {
                if (a.getNota() < 5) {
                    bwSuspensos.write(a.getNombreAlumno());
                    bwSuspensos.newLine();
                } else {
                    bwAprobados.write(a.getNombreAlumno());
                    bwAprobados.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
