/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_02_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_02_2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        int caracter;
        String ruta = "D:\\Usuarios\\DAM106\\Downloads\\onichan.txt";
        FileOutputStream archivo = null;
        
        try{
            
            archivo = new FileOutputStream(ruta);
            while((c = System.in.read()) != 48){
                archivo.write((char) caracter);
            }
        }
        
        
    }
}
