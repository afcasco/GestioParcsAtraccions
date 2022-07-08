public class Botiga extends Serveis {




    public Botiga(String codi, String nom, String tipus) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
    }

    public Botiga() {
        super();
    }

    public void modificarBotiga() {
        codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
        nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
        tipus = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
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

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Codi botiga: " + codi + "\n" +
               "Nom botiga: " + nom + "\n" +
               "Tipus productes: " + tipus;
    }
}