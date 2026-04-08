/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_02_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre del fichero de origen: ");
        String origen = teclado.nextLine();

        System.out.print("Nombre del fichero de destino: ");
        String destino = teclado.nextLine();

      
        try (FileInputStream in = new FileInputStream(origen); FileOutputStream out = new FileOutputStream(destino)) {

            int unByte; // Usamos un int para almacenar el byte leído

            // Mientras el resultado de leer no sea -1 (final del fichero)
            while ((unByte = in.read()) != -1) {
                // Escribimos ese byte en el fichero de destino
                out.write(unByte);
            }

            System.out.println("Copia realizada con éxito byte a byte.");

        } catch (IOException e) {
            System.out.println("Error procesando el archivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
