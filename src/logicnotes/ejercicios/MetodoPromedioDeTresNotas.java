package logicnotes.ejercicios;

public class MetodoPromedioDeTresNotas {

    public static void main(String[] args) {
        float resultado = promedio(3.5F, 4.5F , 2.8F);
        System.out.println("Su nota final es: " + resultado);
    }

    public static float promedio(float nota1, float nota2, float nota3) {
        float resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }
}
