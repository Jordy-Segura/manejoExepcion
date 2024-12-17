/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.aplicacionpersona.clases;

/**
 *
 * @author jordy
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void serializar(Persona persona, String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error al serializar el objeto: " + e.getMessage());
        }
    }

    public static Persona deserializar(String rutaArchivo) {
        Persona persona = null;

        try {
            File archivo = new File(rutaArchivo);
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            persona = (Persona) ois.readObject();
            ois.close();
        } catch (Exception e) {
            System.out.println("Error al deserializar el objeto: " + e.getMessage());
        }

        return persona;
    }
}