/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_01_2;

import java.io.File;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_01_2 {

    public static void main(String[] args) {
        
        File archivo1 = new File("D:/Usuarios/DAM106/Downloads/onichan.txt");

        System.out.println(archivo1.getName());
        System.out.println(archivo1.getAbsolutePath());
        System.out.print("Se puede leer?: ");
        System.out.println(archivo1.canRead());
        System.out.print("Se puede escribir? :");
        System.out.println(archivo1.canWrite());
        System.out.print("Tamaño: ");
        System.out.println(archivo1.length());
        
    }
}
