import java.util.Scanner;

public abstract class Serveis implements Installacio {

    public String codi;
    public String nom;
    public String tipus;
    public final static Scanner DADES = new Scanner(System.in);

    public Serveis() {
        codi = IOUtils.getStringInput("Entra el codi del nou servei:");
        nom = IOUtils.getStringInput("Entra el nom del nou servei:");
        tipus = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
    }

    public Serveis(String codi, String nom, String tipus) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
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
    public void updateInstallacio() {
        codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
        nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
        tipus = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");

    }

    @Override
    public void showInstallacio() {

    }

    public abstract String toString();

}
