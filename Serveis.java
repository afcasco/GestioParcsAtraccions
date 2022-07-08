public abstract class Serveis {

    public String codi;
    public String nom;
    public String tipus;

    public Serveis(){
        codi = IOUtils.getStringInput("Entra el codi del nou servei:");
        nom = IOUtils.getStringInput("Entra el nom del nou servei:");
        tipus = IOUtils.getStringInput("Entra el tipus de productes dels que disposa:");
    }

}
