/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_02_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_1 {

    public static void main(String[] args) throws IOException {

        int caracter;
        FileInputStream archivo = null;
        try {

            archivo = new FileInputStream("D:/Usuarios/DAM106/Downloads/onichan.txt");
            while ((caracter = archivo.read()) != -1) {

                System.out.print((char) caracter);
            }

        } catch (IOException e) {
            System.out.print(e.toString());
        }

    }
}
