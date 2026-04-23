/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_07_1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_07_1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Modulo miModulo = new Modulo("Programación");
        int opcion;

        do {
            
            System.out.println("1.- Añadir un alumno");
            System.out.println("2.- Mostrar iniciales y nota en orden inverso");
            System.out.println("3.- Grabar nombres de aprobados y suspensos");
            System.out.println("4.- Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> miModulo.añadirAlumno();
                case 2 -> miModulo.mostrarInverso();
                case 3 -> miModulo.grabarNombres();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

