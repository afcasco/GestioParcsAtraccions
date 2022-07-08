public abstract class Serveis {

    public String codi;
    public String nom;
    public String tipus;

    public Serveis() {
        codi = IOUtils.getStringInput("Entra el codi del nou servei:");
        nom = IOUtils.getStringInput("Entra el nom del nou servei:");
        tipus = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
    }

    public void modificarServei() {
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

    public abstract String toString();

}
