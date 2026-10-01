package logicnotes;

public class WhileAcumulador {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;

        while (contador <= 10){
            suma += contador;

            System.out.println("Suma: " + suma);

            contador++;

            System.out.println("Contador: " + contador);
        }
    }
}
