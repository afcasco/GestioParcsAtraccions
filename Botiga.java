public class Botiga {

    private String codi;
    private String nom;
    private String productes;

    public Botiga() {
        codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
        nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
        productes = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
    }

    public Botiga(String codi, String nom, String productes) {
        this.codi = codi;
        this.nom = nom;
        this.productes = productes;
    }

    public void modificarBotiga() {
        codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
        nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
        productes = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
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

    public String getProductes() {
        return productes;
    }

    public void setProductes(String productes) {
        this.productes = productes;
    }

    @Override
    public String toString() {
        return "Codi botiga: " + codi + "\n" +
               "Nom botiga: " + nom + "\n" +
               "Tipus productes: " + productes;
    }
}