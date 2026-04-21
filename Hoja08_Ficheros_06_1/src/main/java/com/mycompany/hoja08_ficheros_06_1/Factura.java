/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_06_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author DAM106
 */
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    private int numFactura;
    private String nombre;
    private double importe;
    private boolean pagado;

    public Factura(int numFactura, String nombre, double importe, boolean pagado) {
        this.numFactura = numFactura;
        this.nombre = nombre;
        this.importe = importe;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Factura" + "numFactura=" + numFactura + ", nombre=" + nombre + ", importe=" + importe + ", pagado=" + pagado;
    }

    public static void agregarFactura(Factura f, File fichero) throws FileNotFoundException, IOException {

        ObjectOutputStream fo = null;
        try {
            if (!fichero.exists()) {
                fo = new ObjectOutputStream(new FileOutputStream(fichero, true));
            } else {
                fo = new ObjectOutputStreamSinCabeceras(new FileOutputStream(fichero, true));

            }
            fo.writeObject(f);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fo != null) {
                fo.close();
            }
        }
    }

    public static void listadoDeMorosos(String fichero) throws IOException, ClassNotFoundException {

        ObjectInputStream os = null;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            Factura f;
            while (true) {
                f = (Factura) os.readObject();
                if (!f.pagado) {
                    System.out.println(f);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

}
