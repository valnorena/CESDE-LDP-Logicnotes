package logicnotes;

public class MetodoVoid {

    public static void main(String[] args) {
        saludarPorElNombre("Juan"); // llamado a la función

        sumarDosNumeros(100, 320);

    }

    public static void saludarPorElNombre(String nombre){ //saludarPorElNombre(AQUI SE AGREGA EL NOMBRE QUE QUEREMOS AGREGAR)
        System.out.println("Hola " + nombre);
    }

    public static void sumarDosNumeros(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println("Resultado = " + resultado);
    }
}
