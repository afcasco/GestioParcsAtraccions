import java.util.Scanner;

class IOUtils {

    public static int getIntInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int getIntInput(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String getStringInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.next();
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Selecciona una opcio: ");
        System.out.println("0. Sortir");
        System.out.println("1. Gestio de parcs");
        System.out.println("2. Gestio d'atraccions");
        System.out.println("3. Gestio de botigues");
        System.out.println("4. Gestio de restaurants");
    }

    public static void mostrarMenuParcs() {
        System.out.println("Selecciona una opcio: ");
        System.out.println("0. Sortir");
        System.out.println("1. Alta");
        System.out.println("2. Seleccionar");
        System.out.println("3. Modificar");
        System.out.println("4. Llista de parcs");

    }
}