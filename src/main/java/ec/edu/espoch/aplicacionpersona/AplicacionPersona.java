/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.aplicacionpersona;

import ec.edu.espoch.aplicacionpersona.clases.ArchivoTexto;
import ec.edu.espoch.aplicacionpersona.clases.Persona;
import ec.edu.espoch.aplicacionpersona.clases.Serializacion;
import ec.edu.espoch.aplicacionpersona.clases.Utilidades;

/**
 *
 * @author jordy
 */
public class AplicacionPersona {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Carlos Mancero", 30);

        // Serializar el objeto
        Serializacion.serializar(persona, "persona.ser");

        // Deserializar el objeto
        Persona personaDeserializada = Serializacion.deserializar("persona.ser");

        // Mostrar el contenido del objeto
        System.out.println("Nombre: " + personaDeserializada.getNombre());
        System.out.println("Edad: " + personaDeserializada.getEdad());

        // Leer un archivo de texto
        ArchivoTexto.leerArchivo("archivo.txt");

        // Escribir un archivo de texto
        ArchivoTexto.escribirArchivo("archivo.txt", "Hola, mundo!");

        // Contar el número de palabras en un archivo de texto
        int contadorPalabras = ArchivoTexto.contarPalabras("archivo.txt");
        System.out.println("Número de palabras: " + contadorPalabras);

        // Manejar una excepción
        try {
            // Código que puede lanzar una excepción
        } catch (Exception e) {
            Utilidades.manejarExcepcion(e);
        }
    }
}