package logicnotes;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 0;

        do {
            // el ++ al inicio hace que el contador inicie inmediatamente, en lugar de esperar la ronda
            System.out.println("Contador: " + ++contador);
        }
        while (contador < 3);
    }
}