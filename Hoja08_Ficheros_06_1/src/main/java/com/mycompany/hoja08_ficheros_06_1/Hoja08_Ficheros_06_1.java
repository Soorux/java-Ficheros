/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja08_ficheros_06_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM106
 */
public class Hoja08_Ficheros_06_1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        File fichero = null;
        do{
        System.out.println("1. Añadir Factura");
        System.out.println("2. Listado de Moros");
        System.out.println("3. Eliminar Fichero");
            System.out.println("4. salir");
        opcion = Integer.parseInt(teclado.nextLine());
            switch(opcion){
            
                case 1 -> {
                    System.out.println("Introduce el numero de factura");
                    int num = Integer.parseInt(teclado.nextLine());
                    System.out.println("Introduce el nombre");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduce el importe");
                    double importe = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Pagado o no true/false");
                    boolean pagado = teclado.nextBoolean();
                    teclado.nextLine();
                    fichero = new File("D:\\Usuarios\\DAM106\\Downloads\\facturas.dat");
                    Factura.agregarFactura(new Factura(num,nombre,importe,pagado), fichero);
                }
                case 2 -> {
                    String ruta = "D:\\Usuarios\\DAM106\\Downloads\\";
                    System.out.println("Introduce el nombre del fichero");
                    String nombreFichero = teclado.nextLine();
                    Factura.listadoDeMorosos(ruta + nombreFichero);
                }
                case 3 -> {
                    fichero.delete();
                }
            }   
        
        
        }while(opcion != 4);
    }
}
