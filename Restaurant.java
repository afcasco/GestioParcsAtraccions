public class Restaurant extends Serveis {

    private String espectacle;

    public Restaurant() {
        super();
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    public Restaurant(String codi, String nom, String tipus, String espectacle) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
        this.espectacle = espectacle;
    }

    public void modificarServei() {
        super.modificarServei();
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    public String getEspectacle() {
        return espectacle;
    }

    public void setEspectacle(String espectacle) {
        this.espectacle = espectacle;
    }

    @Override
    public String toString() {
        return "Codi restaurant: " + codi + "\n" +
               "Nom restaurant: " + nom + "\n" +
               "Tipus de menjar: " + tipus + "\n" +
               "Espectacle oferit: " + espectacle;
    }
}
