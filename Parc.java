public class Parc {
    private final Atraccio[] atraccions;
    private final Botiga[] botigues;
    private final Restaurant[] restaurants;
    private String nom;
    private String direccio;

    public Parc() {
        nom = IOUtils.getStringInput("Entra el nom del nou parc:");
        direccio = IOUtils.getStringInput("Entra la seva adreça:");
        atraccions = new Atraccio[IOUtils.getIntInput("Maxim d'atraccions que podra acollir:")];
        botigues = new Botiga[IOUtils.getIntInput("Maxim de botigues que podra acollir:")];
        restaurants = new Restaurant[IOUtils.getIntInput("Maxim de restaurants que podra acollir:")];
    }

    public Parc(String nom, String direccio, int maxAtraccions, int maxBotigues, int maxRestaurants) {
        this.nom = nom;
        this.direccio = direccio;
        atraccions = new Atraccio[maxAtraccions];
        botigues = new Botiga[maxBotigues];
        restaurants = new Restaurant[maxRestaurants];
    }

    public void modificarParc() {
        try {
            nom = IOUtils.getStringInput("Entra nou nom per el parc:");
            direccio = IOUtils.getStringInput("Entra la nova adreça:");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public Atraccio[] getAtraccions() {
        return atraccions;
    }

    public Botiga[] getBotigues() {
        return botigues;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public int numeroAtraccions() {
        int posicio = -1;
        int i = 0;
        boolean trobat = false;
        while (i < atraccions.length && !trobat) {
            if (atraccions[i] == null) {
                posicio = i;
                trobat = true;
            }
            i++;
        }
        return posicio;
    }

    public int numeroBotigues() {
        int posicio = -1;
        int i = 0;
        boolean trobat = false;
        while (i < botigues.length && !trobat) {
            if (botigues[i] == null) {
                posicio = i;
                trobat = true;
            }
            i++;
        }
        return posicio;
    }

    public int numeroRestaurants() {
        int posicio = -1;
        int i = 0;
        boolean trobat = false;
        while (i < restaurants.length && !trobat) {
            if (restaurants[i] == null) {
                posicio = i;
                trobat = true;
            }
            i++;
        }
        return posicio;
    }

    public void afegirAtraccio() {
        int posicio = numeroAtraccions();
        if (posicio == -1) {
            System.out.println("Aquest parc no te mes capacitat");
        } else {
            atraccions[posicio] = new Atraccio();
        }
    }

    public void afegirBotiga() {
        int posicio = numeroBotigues();
        if (posicio == -1) {
            System.out.println("Aquest parc no te mes capacitat");
        } else {
            botigues[posicio] = new Botiga();
        }
    }

    public void afegirRestaurant() {
        int posicio = numeroRestaurants();
        if (posicio == -1) {
            System.out.println("Aquest parc no te mes capacitat");
        } else {
            restaurants[posicio] = new Restaurant();
        }
    }

    @Override
    public String toString() {
        return "Nom del parc: " + nom + "\n" +
               "Direccio del parc: " + direccio;
    }


}