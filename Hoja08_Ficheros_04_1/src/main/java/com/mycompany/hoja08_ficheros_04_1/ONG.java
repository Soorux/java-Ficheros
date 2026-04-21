/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_04_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class ONG {

    Scanner teclado = new Scanner(System.in);
    FileOutputStream fos = null;
    DataOutputStream dos = null;
    DataInputStream di = null;
    String dni;
    String nombre;
    double importe;

    public ONG() {
    }

    
    public void aniadir() throws FileNotFoundException, IOException {
        try {
            fos = new FileOutputStream("D:/Usuarios/DAM106/Downloads/datos.dat", true);
            dos = new DataOutputStream(fos);

            System.out.println("Introduce tu dni");
            dni = teclado.nextLine();
            System.out.println("Introduce tu nombre");
            nombre = teclado.nextLine();
            System.out.println("Introduce el importe");
            importe = teclado.nextDouble();
            teclado.next();
            dos.writeUTF(dni);
            dos.writeUTF(nombre);
            dos.writeDouble(importe);
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (dos != null) {
                dos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
    
    public void mostrar() throws FileNotFoundException{
        try{
            di = new DataInputStream(new FileInputStream("D:/Usuarios/DAM106/Downloads/datos.dat.txt"));
            while(di.available() > 0){
            
            
            }
        
        }
        
    }
    

}
