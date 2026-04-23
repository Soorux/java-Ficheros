/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_07_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM106
 */
public class Proyecto implements Serializable {

    private String nombre;
    private String descripcion;
    private Set<Tareas> tareas;
    private transient Scanner teclado = new Scanner(System.in);

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tareas = new HashSet<>();
    }



    public void aniadirTarea(Proyecto p) {

        System.out.println("Introduce el nombre de la tarea");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la descripcion de la tarea");
        String descripcion = teclado.nextLine();
        System.out.println("Introduce el dia");
        int dia = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el mes");
        int mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el anio");
        int anio = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el porcentaje de ejecucion de la tarea");
        double porcentaje = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("--- Asignación del Responsable ---");
        System.out.println("Introduce nombre del responsable:");
        String nombrePersona = teclado.nextLine();
        System.out.println("Introduce apellidos del responsable:");
        String apellidosPersona = teclado.nextLine();

        Persona responsable = new Persona(nombrePersona, apellidosPersona);

        Tareas nuevaTarea = new Tareas(nombre, descripcion, porcentaje, dia, mes, anio, responsable);

        tareas.add(nuevaTarea);
        System.out.println("Tarea añadida al proyecto correctamente.");

    }

    public void serializar(Proyecto p) throws IOException {

        if (!p.tareas.isEmpty()) {

            File fichero = new File("tareas.txt");
            if (!fichero.exists()) {
                System.out.println("El fichero no existe, se va a intentar crear");
                fichero.createNewFile();

            }
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {

                oos.writeObject(p);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("No hay tareas mi loco");

    }

    public void cargarTareas() {

        File fichero = new File("tareas.txt");
        if (fichero.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                Proyecto p = (Proyecto) ois.readObject();

                for (Tareas t : p.getTareas()) {
                    if (t.getPorcentaje() < 100) {
                        System.out.println(t);

                    }
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("El fichero no existe");

    }

    public Set<Tareas> getTareas() {
        return tareas;
    }

}
