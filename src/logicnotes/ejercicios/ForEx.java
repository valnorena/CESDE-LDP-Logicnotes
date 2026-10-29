package logicnotes.ejercicios;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] pagos = new double[5];

        int i = 0;

        while ( i < pagos.length ) {
         System.out.print("Ingrese el valor del producto " + (i + 1) + ": ");
            pagos[i] = sc.nextDouble();
            i++;
        }

        for (int j = 0; j < pagos.length; j++) {
            System.out.println("Pago " + (j + 1) + ": " + pagos[j]);
        }

        String[] categorias = new String[5];

        // añadir usando for

        // imprimir usando for-each

        // sacar el promedio de los pagos usando un for

        // imprimir la categoria con el valor de gasto
    }
}