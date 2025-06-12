package net.salesianos.Act2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad2 {
    public static void main(String[] args) {
        String texto = "Hola, pibe."; 

        try (FileWriter writer = new FileWriter("actividad2.txt")) {
            writer.write(texto);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

        try (FileReader reader = new FileReader("actividad2.txt")) {
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter + "_" + caracter + ", ");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}

