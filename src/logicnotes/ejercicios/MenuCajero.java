package logicnotes.ejercicios;

import logicnotes.ValidadorDeTipos;

public class MenuCajero {
    public static void main(String[] args) {

        // iniciador
        int opcion = 0;

        // bucle
        while(opcion != 4) {

            System.out.println("¡Bienvenido!\n" +
                    "Seleccione la opcion que necesite:\n" +
                    "1. Consultar saldo\n" +
                    "2. Depositar\n" +
                    "3. Retirar\n" +
                    "4. Salir\n" +
                    " ");

            System.out.println("Ingrese opcion: ");

            // variable - scanner
            opcion = ValidadorDeTipos.validarEnteros();

            // seleccion multiple
            switch (opcion) {
                case 1:
                    System.out.println("A continuación, podra consultar su saldo.\n" + "----------");
                    break;
                case 2:
                    System.out.println("A continuación, podra depositar dinero.\n" + "----------");
                    break;
                case 3:
                    System.out.println("A continuación, podra retirar dinero.\n" + "----------");
                    break;
                case 4:
                    System.out.println("Salir\n" + "¡Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida.\n" + "Vuelva a intentarlo.\n" + "----------");
            }
        }
    }
}