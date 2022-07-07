import java.util.ArrayList;

public class Aplicacio {

    static Parc parc = null;
    static ArrayList<Parc> parcs = new ArrayList<>();

    public static void main(String[] args) {

        int opcio;
        do {
            IOUtils.mostrarMenuPrincipal();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    gestionarParcs();
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

    private static void gestionarParcs() {
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
        int opcio = 0;
        do{
            IOUtils.mostrarMenuAtraccions();
            opcio = IOUtils.getIntInput();
            switch(opcio){
                case 1:
                    parc.afegirAtraccio();
                    break;
                case 2:
                    parc.getAtraccions()[0].modificaAtraccio();
                    break;
                case 3:
                    System.out.println(parc.getAtraccions().toString());
            }

        } while(opcio!=0);

    }

    private static void gestionarBotigues() {

    }

    private static void gestionarRestaurants() {

    }
}