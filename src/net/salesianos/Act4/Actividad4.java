package net.salesianos.Act4;

import java.util.List;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva mesa");
            System.out.println("2. Mostrar mesas guardadas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("color?: ");
                    String color = scanner.nextLine();
                    System.out.print("Nº de patas?: ");
                    int patas = scanner.nextInt();
                    Mesa nueva = new Mesa(color, patas);
                    MesaManager.guardarMesa(nueva);
                    break;
                case 2:
                    List<Mesa> mesas = MesaManager.obtenerMesas();
                    if (mesas.isEmpty()) {
                        System.out.println("No hay mesas.");
                    } else {
                        for (Mesa m : mesas) {
                            System.out.println(m.mostrar());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Programa acabado.");
                    break;
                default:
                    System.out.println("No válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
