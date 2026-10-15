package logicnotes.ejercicios;

import java.util.Scanner;

public class ComprasSystem {

    static String[] productos = new String[5];
    static double[] precios = new double[5];

    // Un solo Scanner para toda la clase, así todos los métodos pueden leer del teclado
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuCompras();
    }

    public static void agregarProductos() {
        // 1. Con while buscamos la primera posición vacía (por si ya había productos)
        int i = 0;
        while (i < productos.length && productos[i] != null) {
            i++;
        }

        if (i == productos.length) {
            System.out.println("El carrito está lleno (máximo " + productos.length + " productos).");
            return;
        }

        // 2. Con while pedimos productos hasta llenar el arreglo o hasta que escriba "fin"
        System.out.println("Escribe los productos (o 'fin' para terminar):");
        while (i < productos.length) {
            System.out.print("Producto " + (i + 1) + ": ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            productos[i] = nombre;
            i++;
        }
    }

    public static void agregarPrecios() {
        // Recorremos los productos que existen y pedimos precio solo a los que aún no tienen
        int i = 0;
        while (i < productos.length && productos[i] != null) {
            if (precios[i] == 0) {
                double precio = 0;
                // Este while valida: no deja avanzar hasta que el precio sea mayor que 0
                while (precio <= 0) {
                    System.out.print("Precio de " + productos[i] + ": ");
                    precio = Double.parseDouble(sc.nextLine());
                    if (precio <= 0) {
                        System.out.println("El precio debe ser mayor que 0.");
                    }
                }
                precios[i] = precio;
            }
            i++;
        }
    }

    public static void mostrarProductos() {
        if (productos[0] == null) {
            System.out.println("Todavía no hay productos.");
            return;
        }
        int i = 0;
        while (i < productos.length && productos[i] != null) {
            System.out.println((i + 1) + ". " + productos[i]);
            i++;
        }
    }

    public static void mostrarPrecios() {
        if (productos[0] == null) {
            System.out.println("Todavía no hay precios.");
            return;
        }
        int i = 0;
        while (i < productos.length && productos[i] != null) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            i++;
        }
    }

    public static double calcularTotal() {
        double total = 0;
        int i = 0;
        while (i < productos.length && productos[i] != null) {
            total = total + precios[i];
            i++;
        }
        return total;
    }

    public static void menuCompras() {
        int opcion = 0;

        while (opcion != 5) {
            System.out.println();
            System.out.println("===== MENÚ DE COMPRAS =====");
            System.out.println("1. Agregar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Mostrar precios");
            System.out.println("4. Calcular total");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarProductos();
                    agregarPrecios();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    mostrarPrecios();
                    break;
                case 4:
                    System.out.println("Total a pagar: $" + calcularTotal());
                    break;
                case 5:
                    System.out.println("Gracias por tu compra. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }
}