/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_02_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_3 {

    public static void main(String[] args) {
        String archivoOrigen = "archivo_origen.txt"; // Cambia este nombre al archivo de origen
        String archivoDestino = "archivo_destino.txt"; // Cambia este nombre al archivo de destino

        // Verificar si el archivo de origen existe
        File origen = new File(archivoOrigen);
        if (!origen.exists() || !origen.isFile()) {
            System.out.println("El archivo de origen no existe o no es válido.");
            return;
        }

        FileInputStream lector = null;
        FileOutputStream escritor = null;

        try {
            // Abrir streams para leer y escribir
            lector = new FileInputStream(origen);
            escritor = new FileOutputStream(archivoDestino);

            int byteLeido;
            while ((byteLeido = lector.read()) != -1) {
                escritor.write(byteLeido); // Escribir cada byte en el archivo de destino
                System.out.print((char) byteLeido); // Mostrar por pantalla el carácter                
            }

            System.out.println("El archivo se ha copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error durante la copia: " + e.getMessage());
        } finally {
            // Cerrar streams manualmente
            try {
                if (lector != null) {
                    lector.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los archivos: " + e.getMessage());
            }
        }
    }
}
