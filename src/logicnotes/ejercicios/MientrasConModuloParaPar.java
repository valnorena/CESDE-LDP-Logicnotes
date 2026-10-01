package logicnotes.ejercicios;

public class MientrasConModuloParaPar {
    public static void main(String[] args) {
        int inicio = 0;
        
        while (inicio <= 100) {
            if (inicio % 2==0){
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}