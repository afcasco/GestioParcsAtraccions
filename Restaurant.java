public class Restaurant {

    private String codi;
    private String nom;
    private String menjar;
    private String espectacle;

    public Restaurant() {
        codi = IOUtils.getStringInput("Entra el codi del nou restaurant:");
        nom = IOUtils.getStringInput("Entra el nom del nou restaurant:");
        menjar = IOUtils.getStringInput("Entra el tipus de menjar que servira:");
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    public Restaurant(String codi, String nom, String menjar, String espectacle) {
        this.codi = codi;
        this.nom = nom;
        this.menjar = menjar;
        this.espectacle = espectacle;
    }

    public void modificarRestaurant() {
        codi = IOUtils.getStringInput("Entra el codi del nou restaurant:");
        nom = IOUtils.getStringInput("Entra el nom del nou restaurant:");
        menjar = IOUtils.getStringInput("Entra el tipus de menjar que servira:");
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMenjar() {
        return menjar;
    }

    public void setMenjar(String menjar) {
        this.menjar = menjar;
    }

    public String getEspectacle() {
        return espectacle;
    }

    public void setEspectacle(String espectacle) {
        this.espectacle = espectacle;
    }

    @Override
    public String toString() {
        return "Codi restaurant: " + codi + "\n" + "Nom restaurant: " + nom + "\n" + "Tipus de menjar: " + menjar + "\n" + "Espectacle oferit: " + espectacle;
    }
}
