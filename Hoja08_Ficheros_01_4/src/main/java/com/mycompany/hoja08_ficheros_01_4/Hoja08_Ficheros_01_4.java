/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_01_4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_01_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre de la carpeta que quieras inspeccionar manin.");
        String nombre = teclado.nextLine();

        File carpeta = new File(nombre);
        
        listaArchivos(carpeta);

    }
    
        private static void listaArchivos(File carpeta) {

        File[] miputamadre = carpeta.listFiles();

        for (File file : miputamadre) {
            if (file.isDirectory()) {
                listaArchivos(file);
            } else {
                for (File files : miputamadre) {
                    System.out.println(files.getName());
                }

            }
        }
    }
    
}
