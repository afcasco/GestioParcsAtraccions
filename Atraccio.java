public class Atraccio {

    private String codi;
    private String nom;
    private int altMinima;
    private int intensitat;

    public Atraccio() {
        codi = IOUtils.getStringInput("Entra el codi de la nova atraccio:");
        nom = IOUtils.getStringInput("Entra el nom de la nova atraccio:");
        altMinima = IOUtils.getIntInput("Entra l'alcada minima per poder puajr-hi:");
        intensitat = IOUtils.getIntInput("Entra la intensitat de la nova atraccio:");
    }

    public Atraccio(String codi, String nom, int altMinima, int intensitat) {
        this.codi = codi;
        this.nom = nom;
        this.altMinima = altMinima;
        this.intensitat = intensitat;
    }

    public void modificaAtraccio() {
        codi = IOUtils.getStringInput("Entra el codi de la nova atraccio:");
        nom = IOUtils.getStringInput("Entra el nom de la nova atraccio:");
        altMinima = IOUtils.getIntInput("Entra l'alcada minima per poder puajr-hi:");
        intensitat = IOUtils.getIntInput("Entra la intensitat de la nova atraccio:");
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

    public int getAltMinima() {
        return altMinima;
    }

    public void setAltMinima(int altMinima) {
        this.altMinima = altMinima;
    }

    public int getIntensitat() {
        return intensitat;
    }

    public void setIntensitat(int intensitat) {
        this.intensitat = intensitat;
    }

    @Override
    public String toString() {
        return "Codi atraccio: " + codi + "\t" + "Nom atraccio: " + nom + "\t" + "Altura minima: " + altMinima
               + "\t" + "Intensitat atraccio: " + intensitat;
    }
}