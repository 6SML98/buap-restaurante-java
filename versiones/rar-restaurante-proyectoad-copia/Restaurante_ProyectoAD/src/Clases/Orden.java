package Clases;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Orden {

    private String elemento;
    private double precio;

    public Orden(String elemento, double precio) {
        this.elemento = elemento;
        this.precio = precio;
    }

    Orden() {
    }

    public String getElemento() {
        return elemento;
    }

    public double getPrecio() {
        return precio;
    }

public void agregarPlaillo() {
    try {
        File archivo = new File("Orden.txt");
        FileWriter escritor = new FileWriter(archivo, true);
        Scanner scanner = new Scanner(System.in);

        escritor.close();
        System.out.println("Plato agregado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo del menú: " + e.getMessage());
    }
}    
    public void mostrarOrden() {
    try {
        File archivo = new File("Orden.txt");
        Scanner scanner = new Scanner(archivo);
        int indice = 1;

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(indice + ". " + linea);
            indice++;
        }
        scanner.close();
    } catch (IOException e) {
        System.out.println("Error al leer el archivo del menú: " + e.getMessage());
    }
}


    public double calcularTotal(String rutaArchivo) {
        double total = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Orden.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] elementos = linea.split(",");
                if (elementos.length == 2) {
                    String elemento = elementos[0].trim();
                    double precio = Double.parseDouble(elementos[1].trim());
                    Orden orden = new Orden(elemento, precio);
                    total += orden.getPrecio();
                    System.out.println("Elemento: " + orden.getElemento() + ", Precio: $" + orden.getPrecio());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return total;
    }
}
