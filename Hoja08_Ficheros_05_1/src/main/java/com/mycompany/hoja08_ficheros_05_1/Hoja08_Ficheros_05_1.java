/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_05_1;

import static com.mycompany.hoja08_ficheros_05_1.GestionAlumnos.grabarAlumno;
import static com.mycompany.hoja08_ficheros_05_1.GestionAlumnos.leerAlumnosPares;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_05_1 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- GESTIÓN DE ALUMNOS ---");
            System.out.println("1. Añadir nuevo alumno");
            System.out.println("2. Leer alumnos de posición par");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota 1: ");
                    int n1 = sc.nextInt();
                    System.out.print("Nota 2: ");
                    int n2 = sc.nextInt();
                    System.out.print("Nota 3: ");
                    int n3 = sc.nextInt();
                    grabarAlumno(matricula, nombre, n1, n2, n3);
                    break;
                case 2:
                    leerAlumnosPares();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        
        sc.close();
    }
}
