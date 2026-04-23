/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_07_1;

import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Alumno {
    
    private String nombreAlumno;
    private int nota;
    Scanner teclado = new Scanner(System.in);

    public Alumno() {
        System.out.println("Introduce el nombre: ");
        this.nombreAlumno = teclado.nextLine();
        System.out.println("Introduce la nota: ");
        this.nota = Integer.parseInt(teclado.nextLine());
    }

    public Alumno(String nombreAlumno, int nota) {
        this.nombreAlumno = nombreAlumno;
        this.nota = nota;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public int getNota() {
        return nota;
    }
    
    
 
    
    
    
    
}
