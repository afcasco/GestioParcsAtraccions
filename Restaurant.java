public class Restaurant extends Serveis {

    private String espectacle;

    public Restaurant() {
        super();
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    public Restaurant(String espectacle) {
        super();
        this.espectacle = espectacle;
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

    @Override
    public void updateInstallacio() {
        super.updateInstallacio();
        espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
    }

    @Override
    public void showInstallacio() {
    // already overriden toString method in each class..
    }
}
