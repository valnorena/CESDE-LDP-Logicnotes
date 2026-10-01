package logicnotes.ejercicios;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] ages = new int [7];

        int i = 0;

        while (i < 7){
            System.out.println("Ingrese la edad " + (i+1) + ":");
            ages[i] = sc.nextInt();
            i++;
        }

        System.out.println(i);

        int j = 0;

        while (j < 7){
            System.out.println("Edad " + (j+1) + ": " +  ages[j]);
            j++;
        }
    }
}