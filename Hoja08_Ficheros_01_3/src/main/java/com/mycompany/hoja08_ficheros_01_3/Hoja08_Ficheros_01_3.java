/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_01_3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_01_3 {

    public static void main(String[] args) throws IOException {
        
        try{
            File archivo = new File("D:/Usuarios/DAM106/Downloads/onichan2.txt");
            if (archivo.createNewFile()) {
                System.out.println("archivo creado: " + archivo.getName());
            } else {
                System.out.println("Ya existe.");
            }
        }
        catch(IOException e){
        }
    }
}
