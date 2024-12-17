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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoTexto {
    public static void leerArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            FileReader lector = new FileReader(archivo);
            Scanner scanner = new Scanner(lector);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void escribirArchivo(String rutaArchivo, String contenido) {
        try {
            File archivo = new File(rutaArchivo);
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static int contarPalabras(String rutaArchivo) {
        int contadorPalabras = 0;

        try {
            File archivo = new File(rutaArchivo);
            FileReader lector = new FileReader(archivo);
            Scanner scanner = new Scanner(lector);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] palabras = linea.split("\\s+");
                contadorPalabras += palabras.length;
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorPalabras;
    }
}