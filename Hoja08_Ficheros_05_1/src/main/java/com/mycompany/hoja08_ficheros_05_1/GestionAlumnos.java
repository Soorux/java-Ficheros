/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_05_1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author DAM106
 */
public class GestionAlumnos {

    
    private static final String RUTA_ARCHIVO = "D:\\Usuarios\\DAM106\\Downloads\\alumnos.dat";
    private static final int LONGITUD_NOMBRE = 20;
    private static final int TAM_REGISTRO = 4 + (LONGITUD_NOMBRE * 2) + 12;


    public static void grabarAlumno(int matricula, String nombre, int n1, int n2, int n3) {
        try (RandomAccessFile raf = new RandomAccessFile(RUTA_ARCHIVO, "rw")) {
            raf.seek(raf.length());
            
            raf.writeInt(matricula);
            
            StringBuilder buffer = new StringBuilder(nombre);
            buffer.setLength(LONGITUD_NOMBRE);
            raf.writeChars(buffer.toString());
            
            raf.writeInt(n1);
            raf.writeInt(n2);
            raf.writeInt(n3);
            
            System.out.println("Alumno guardado en: " + RUTA_ARCHIVO);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void leerAlumnosPares() {
        try (RandomAccessFile raf = new RandomAccessFile(RUTA_ARCHIVO, "r")) {
            long totalRegistros = raf.length() / TAM_REGISTRO;
            
            for (int i = 0; i < totalRegistros; i += 2) {
                raf.seek(i * TAM_REGISTRO);
                
                int matricula = raf.readInt();
                
                StringBuilder nombre = new StringBuilder();
                for (int c = 0; c < LONGITUD_NOMBRE; c++) {
                    nombre.append(raf.readChar());
                }
                
                int n1 = raf.readInt();
                int n2 = raf.readInt();
                int n3 = raf.readInt();
                
                System.out.println("Posición " + i + ": " + matricula + " | " + 
                                   nombre.toString().trim() + " | Notas: " + 
                                   n1 + ", " + n2 + ", " + n3);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}