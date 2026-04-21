/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja08_ficheros_06_1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author DAM106
 */
public class ObjectOutputStreamSinCabeceras extends ObjectOutputStream {

    public ObjectOutputStreamSinCabeceras(OutputStream out) throws IOException {
        super(out);
    }

    public ObjectOutputStreamSinCabeceras() throws IOException {
    }
    
    @Override
    public void writeStreamHeader()throws IOException {}    
}
