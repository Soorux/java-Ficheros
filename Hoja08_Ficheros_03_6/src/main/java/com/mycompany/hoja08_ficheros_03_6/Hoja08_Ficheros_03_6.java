/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_03_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_03_6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter br = null;

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el nombre del primer fichero");
            String ruta = "D:/Usuarios/DAM106/Downloads/";
            String archivo1 = ruta + teclado.nextLine();
            System.out.println("Introduce el nombre del segundo fichero");
            String archivo2 = ruta + teclado.nextLine();
            System.out.println("Introduce el nombre del tercer fichero que quieres: ");
            String archivo3 = ruta + teclado.nextLine();

            File fichero1 = new File(archivo1);
            FileReader a1 = new FileReader(archivo1);
            br1 = new BufferedReader(a1);
            File fichero2 = new File(archivo2);
            FileReader a2 = new FileReader(archivo2);
            br2 = new BufferedReader(a2);
            File a3 = new File(archivo3);
            existeArchivo(a3);

            a3.createNewFile();

            FileWriter fr = new FileWriter(a3);
            br = new BufferedWriter(fr);

            String linea;

            while ((linea = br1.readLine()) != null) {
                br.write(linea);
            }
            while ((linea = br2.readLine()) != null) {
                br.write(linea);
            }

            System.out.println(fichero1.length() + fichero1.getAbsolutePath());
            System.out.println(fichero2.length() + fichero2.getAbsolutePath());
            System.out.println(a3.length() + a3.getAbsolutePath());
            
            
        } catch (ArchivoExistenteException e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
            br1.close();
            br2.close();
        }

    }

    private static boolean existeArchivo(File f) throws ArchivoExistenteException {

        if (f.exists()) {
            throw new ArchivoExistenteException("Ya existe");
        }

        return false;

    }
}
