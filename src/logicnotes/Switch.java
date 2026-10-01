package logicnotes;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Seleccione 1. Cuenta de Ahorros\n" +
                "2.Crédito\n" +
                "3.Inversion\n" +
                "4. Mis dato");

        int option = ValidadorDeTipos.validarEnteros();

        System.out.println(option);

        switch (option) {
            case 1:
                System.out.println("Cuenta de Ahorros");
                break;
            case 2:
                System.out.println("Crédito");
                break;
            case 3:
                System.out.println("Inversion");
                break;
            case 4:
                System.out.println("Mis Datos");
                break;
            default:
                System.out.println("Opción no valida.");
        }
    }
}
