package logicnotes;
import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso: ");
        float peso = sc.nextFloat();

        System.out.print("Ingrese su altura: ");
        float altura = sc.nextFloat();

        float imc = Math.round(peso / (altura * altura));
        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Tu peso se encuentra por debajo del rango recomendado para tu estatura.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tu peso se encuentra dentro del rango saludable.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tu peso se encuentra por encima del rango recomendado para tu estatura.");
        } else {
            System.out.println("Tu peso indica que te encuentras en la categoría de obesidad, muy por encima del rango recomendado.");
        }
    }
}
