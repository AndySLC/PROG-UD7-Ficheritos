package net.salesianos.Act1;

import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;   

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        do {
            System.out.print("Introduce un texto (mínimo 30 caracteres): ");
            texto = scanner.nextLine();
            if (texto.length() < 30) {
                System.out.println("Faltan " + (30 - texto.length()) + " caracteres.");
            }
        } while (texto.length() < 30);

        // Convertimos a mayúsculas y reemplazamos espacios por guiones bajos
        String textoFormateado = texto.toUpperCase().replace(" ", "_");

        // Guardamos el texto en un fichero
        try (FileWriter writer = new FileWriter("actividad1.txt")) {
            writer.write(textoFormateado);
            System.out.println("Texto guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
        scanner.close();
    }
}
