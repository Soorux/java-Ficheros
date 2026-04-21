/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hoja08_ficheros_04_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_04_2 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        DataInputStream di = null;
        int num;
        String nombre;
        int nota1;
        int nota2;
        int nota3;

        try {
            fos = new FileOutputStream("D:/Usuarios/DAM106/Downloads/Promocionan.dat");
            dos = new DataOutputStream(fos);
            di = new DataInputStream(new FileInputStream("Alumnos.dat"));
            while (di.available() > 0) {

                num = di.readInt();;
                nombre = di.readUTF();
                nota1 = di.readInt();
                nota2 = di.readInt();
                nota3 = di.readInt();
                System.out.println("Numero de matricula: " + num + " Nombre " + nombre
                        + " nota1 " + nota1 + " nota2 " + nota2 + " nota3 " + nota3);

                if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {

                    dos.writeInt(num);
                    dos.writeUTF(nombre);
                    dos.writeInt(nota1);
                    dos.writeInt(nota2);
                    dos.writeInt(nota3);
                    System.out.println("PROMOCIONA");
                }
                else{
                    System.out.println("NO PROMOCIONA");
                }
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (di != null) {
                di.close();
            }
            if (dos != null) {
                dos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }

    }
}
