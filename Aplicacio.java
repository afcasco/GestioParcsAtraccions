import java.util.ArrayList;

public class Aplicacio {

    private static final ArrayList<Parc> parcs = new ArrayList<>();
    private static Parc parc = null;

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
                    parcs.add(new Parc());
                    break;
                case 2:
                    seleccionarParc();
                    break;
                case 3:
                    parc.modificarParc();
                    break;
                case 4:
                    llistarParcs();
                    break;
            }
        } while (opcio != 0);
    }

    private static void seleccionarParc() {
        int i = 0;
        String busquem = IOUtils.getStringInput("Quin parc vols seleccionar:");
        boolean trobat = false;
        while (i < parcs.size() && !trobat) {
            if (parcs.get(i).getNom().equalsIgnoreCase(busquem)) {
                parc = parcs.get(i);
                trobat = true;
                System.out.println("trobat el parc: " + parc.getNom());
            } else {
                i++;
            }
        }
        if (!trobat) System.out.println("Aquest parc no esta al sistema!");
    }

    private static void llistarParcs() {
        for (Parc parc : parcs) {
            System.out.println(parc);
        }
    }

    private static void gestionarAtraccions() {
        int opcio;
        do {
            IOUtils.mostrarMenuAtraccions();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    parc.afegirAtraccio();
                    break;
                case 2:
                    // implementar modificar atraccio existent
                    break;
                case 3:
                    // it works but want to change it so it doesnt need to break out of the for loop
                    for (Atraccio atraccio : parc.getAtraccions()) {
                        if (atraccio != null) {
                            System.out.println(atraccio);
                        } else {
                            break;
                        }
                    }
                    break;
            }
        } while (opcio != 0);
    }


    private static void gestionarBotigues() {
        int opcio;
        do {
            IOUtils.mostrarMenuBotigues();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    parc.afegirBotiga();
                    break;
                case 2:
                    // implementar modificar atraccio existent
                    break;
                case 3:
                    // it works but want to change it so it doesnt need to break out of the for loop
                    for (Botiga botiga : parc.getBotigues()) {
                        if (botiga != null) {
                            System.out.println(botiga);
                        } else {
                            break;
                        }
                    }
                    break;
            }
        } while (opcio != 0);

    }

    private static void gestionarRestaurants() {
        int opcio;
        do {
            IOUtils.mostrarMenuRestaurants();
            opcio = IOUtils.getIntInput();
            switch (opcio) {
                case 1:
                    parc.afegirRestaurant();
                    break;
                case 2:
                    // implementar modificar restaurant existent
                    break;
                case 3:
                    // it works but want to change it so it doesnt need to break out of the for loop
                    for (Restaurant restaurant : parc.getRestaurants()) {
                        if (restaurant != null) {
                            System.out.println(restaurant);
                        } else {
                            break;
                        }
                    }
                    break;
            }
        } while (opcio != 0);
    }
}