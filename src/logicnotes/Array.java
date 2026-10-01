package logicnotes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Se queman los datos
        String[] names = {"Maria", "Luis", "Juan"};

        int ages [] = new int[4];

        // Se mandan los datos
        ages[0] = 23;
        ages[1] = 26;
        ages[2] = 34;
        ages[3] = 19;

        System.out.println("Posicion 1: " + ages[0]);
        System.out.println("Posicion 2: " + ages[1]);
        System.out.println("Posicion 3: " + ages[2]);
        System.out.println("Posicion 4: " + ages[3]);

        // Usar Scanner para capturar datos desde la terminal

        double [] salaries = new double [3];
        salaries[0] = sc.nextDouble();
        salaries[1] = sc.nextDouble();
        salaries[2] = sc.nextDouble();

        System.out.println(salaries[0] +" \n" +salaries[1] +" \n" +salaries[2]);
    }
}
