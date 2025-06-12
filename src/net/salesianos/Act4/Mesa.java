package net.salesianos.Act4;
public class Mesa {
    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return color + "," + numeroPatas;
    }

    public static Mesa desdeTexto(String linea) {
        String[] partes = linea.split(",");
        String color = partes[0];
        int patas = Integer.parseInt(partes[1]);
        return new Mesa(color, patas);
    }

    public String mostrar() {
        return "Mesa [Color: " + color + ", Patas: " + numeroPatas + "]";
    }
}
