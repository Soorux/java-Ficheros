/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_02_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_7 {

    public static void main(String[] args) throws FileNotFoundException, ArchivoExistenteException {

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el nombre del primer fichero");
            String ruta = "D:/Usuarios/DAM106/Downloads/";
            String archivo1 = ruta + teclado.nextLine();
            System.out.println("Introduce el nombre del segundo fichero");
            String archivo2 = ruta + teclado.nextLine();
            System.out.println("Introduce el nombre del tercer fichero que quieres: ");
            String archivo3 = ruta + teclado.nextLine();

            FileInputStream a1 = new FileInputStream(archivo1);
            FileInputStream a2 = new FileInputStream(archivo2);
            File a3 = new File(archivo3);
            existeArchivo(a3);

        }
        catch(ArchivoExistenteException e){
            System.out.println(e.getMessage());
        }

    }

    private static boolean existeArchivo(File f) throws ArchivoExistenteException {

        if (f.exists()) {
            throw new ArchivoExistenteException("Ya existe");
        }

        return false;

    }
}
