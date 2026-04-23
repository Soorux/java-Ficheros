/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_07_2;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author DAM106
 */
public class Tareas implements Serializable {

    private String nombre;
    private String descripcion;
    private Calendar fecha;
    private double porcentaje;
    private Persona responsable;

    public Tareas(String nombre, String descripcion, double porcentaje, int dia, int mes, int anio, Persona responsable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
        Calendar fhoy = Calendar.getInstance();
        fhoy.setLenient(false);
        fhoy.set(anio, mes -1, dia);
        fhoy.getTime();
        this.fecha = fhoy;

        this.responsable = responsable;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        return "Tareas{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", porcentaje=" + porcentaje + ", responsable=" + responsable + '}';
    }
    
    

}
