package net.salesianos.Act4;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class MesaManager {
    private static final String FICHERO = "mesas.txt";

    public static void guardarMesa(Mesa mesa) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))) {
            bw.write(mesa.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la mesa.");
        }
    }

    public static List<Mesa> obtenerMesas() {
        List<Mesa> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Mesa mesa = Mesa.desdeTexto(linea);
                lista.add(mesa);
            }
        } catch (IOException e) {
        }

        return lista;
    }
}
