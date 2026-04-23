
package com.mycompany.hoja08_ficheros_07_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_07_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Proyecto miProyecto = null;
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE PROYECTOS ---");
            System.out.println("1. Crear un proyecto");
            System.out.println("2. Añadir tarea al proyecto");
            System.out.println("3. Serializar tareas");
            System.out.println("4. Cargar tareas incompletas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del proyecto:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce la descripción del proyecto:");
                    String desc = sc.nextLine();
                    miProyecto = new Proyecto(nombre, desc);
                    System.out.println("Proyecto creado correctamente.");
                    break;

                case 2:
                    if (miProyecto != null) {
                        miProyecto.aniadirTarea(miProyecto);
                    } else {
                        System.out.println("Error: Primero debes crear un proyecto (Opción 1).");
                    }
                    break;

                case 3:
                    if (miProyecto != null) {
                        try {
                            miProyecto.serializar(miProyecto);
                        } catch (IOException e) {
                            System.out.println("Error al serializar: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Error: No hay proyecto para serializar.");
                    }
                    break;

                case 4:
                   
                    if (miProyecto != null) {
                        miProyecto.cargarTareas();
                    } else {
                       
                        new Proyecto("", "").cargarTareas();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
