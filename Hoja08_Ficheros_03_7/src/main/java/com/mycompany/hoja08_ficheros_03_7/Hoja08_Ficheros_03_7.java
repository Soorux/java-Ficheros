/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_03_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_03_7 {

    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;   
        FileWriter fw = null;
        BufferedWriter bw = null;
        int contadorLineas = 1;
        File fichero = new File("D:/Usuarios/DAM106/Downloads/poema.txt");
        File fichero2 = new File("D:/Usuarios/DAM106/Downloads/poema2.txt");
        fichero2.createNewFile();
        String linea;
        try {

            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            
            fw = new FileWriter(fichero2);
            bw = new BufferedWriter(fw);

            while ((linea = br.readLine()) != null) {

                for (int i = 0; i < linea.length(); i++) {
                    char letra = linea.charAt(i);
                    bw.write( letra - contadorLineas);
                }
                contadorLineas++;

            }

        } catch (IOException e) {

        } finally {
            br.close();
            bw.close();
        }

    }
}
