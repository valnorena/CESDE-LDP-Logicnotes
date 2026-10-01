package logicnotes.ejercicios;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhileNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] names = new String[7];

        int i = 0;

        while (i < 7){
            System.out.println("Ingrese el nombre " + (i+1) + ":");
            names[i] = sc.nextLine();
            i++;
        }

        System.out.println(i);

        int j = 0;

        while (j < 7){
            System.out.println("Edad " + (j+1) + ": " +  names[j]);
            j++;
        }
    }
}