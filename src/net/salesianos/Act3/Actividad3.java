package net.salesianos.Act3;

import java.io.*;

public class Actividad3 {
    public static void main(String[] args) {
        try {
            String texto1 = leerFichero("actividad1.txt");
            String texto2 = leerFichero("actividad2.txt");

            try (FileWriter writer = new FileWriter("actividad3.txt")) {
                writer.write("Contenido del Fichero Uno: " + texto1 + "\n");
                writer.write("Contenido del Fichero Dos: " + texto2 + "\n");
                writer.write("Archivo generado por Actividad 3.\n");
            }

            System.out.println("Archivo actividad3.txt creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al fusionar archivos.");
        }
    }

    private static String leerFichero(String nombre) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
