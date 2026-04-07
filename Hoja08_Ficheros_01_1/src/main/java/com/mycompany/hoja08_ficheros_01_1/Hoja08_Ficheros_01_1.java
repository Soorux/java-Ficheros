/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_01_1;

import java.io.File;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_01_1 {

    public static void main(String[] args) {
        
        File archivo1 = new File("D:/Usuarios/DAM106/Downloads/onichan.txt");
        
        if(archivo1.exists()){
            System.out.println("Si existe el fichero onichan.txt");  
        }
        else{
            System.out.println("No existe el fichero onichan.txt");
            }
        
    }
}
