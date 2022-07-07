import java.util.ArrayList;

public class Aplicacio {

    public static void main(String[] args) {

        ArrayList<Parc> parcs = new ArrayList<>();
        Parc parc = null;
        int opcio;

        do {
            IOUtils.mostrarMenuPrincipal();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    gestionarParcs(parc, parcs);
                    break;
                case 2:
                    gestionarAtraccions();
                    break;
                case 3:
                    gestionarBotigues();
                    break;
                case 4:
                    gestionarRestaurants();
                    break;
            }
        } while (opcio != 0);

    }

    private static void gestionarParcs(Parc parc, ArrayList<Parc> parcs) {
        int opcio;
        do {
            IOUtils.mostrarMenuParcs();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    // alta parc
                    parcs.add(new Parc());
                    break;
                case 2:
                    // seleccionar parc
                    parc = parcs.get(IOUtils.getIntInput("Selecciona el parc"));
                    break;
                case 3:
                    // modificar parc
                    parc.modificarParc();
                    break;
                case 4:
                    // lista de parcs
                    System.out.println(parcs.toString());
                    break;

            }
        } while (opcio != 0);

    }

    private static void gestionarAtraccions() {

    }

    private static void gestionarBotigues() {

    }

    private static void gestionarRestaurants() {

    }
}