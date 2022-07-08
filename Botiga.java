public class Botiga extends Serveis {

    public Botiga(String codi, String nom, String tipus) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
    }

    public Botiga() {
        super();
    }

    @Override
    public String toString() {
        return "Codi botiga: " + codi + "\n" +
               "Nom botiga: " + nom + "\n" +
               "Tipus productes: " + tipus;
    }
}