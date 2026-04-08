/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_02_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el nombre del fichero");
            String ruta = "D:/Usuarios/DAM106/Downloads/";
            String nombreArchivo = ruta + teclado.nextLine();
            String espacio = " ";
            String palabra = "";

            File file = new File(nombreArchivo);
            FileInputStream archivo = new FileInputStream(nombreArchivo);
            int caracter;

            while ((caracter = archivo.read()) != -1) {
                char letra = (char) caracter;
                palabra += letra;
                if (espacio.indexOf(letra) != -1) {

                    System.out.println("Palabra: " + palabra + " (Longitud: " + palabra.length() + ")");
                    palabra = "";

                }

            System.out.println(palabra + "\n");

        }
    }
    catch(IOException e

    
    

){
        }
    }

}
