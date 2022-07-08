public class Atraccio {

	private String codi;
	private String nom;
	private int altMinima;
	private int intensitat;

	public Atraccio(){
		codi = IOUtils.getStringInput("Entra el codi de la nova atraccio: \n");
		nom = IOUtils.getStringInput("Entra el nom de la nova atraccio: \n");
		altMinima = IOUtils.getIntInput("Entra l'alcada minima per poder puajr-hi: \n");
		intensitat = IOUtils.getIntInput("Entra la intensitat de la nova atraccio: \n");
	}

	public Atraccio(String codi, String nom, int altMinima, int intensitat){
		this.codi = codi;
		this.nom = nom;
		this.altMinima = altMinima;
		this.intensitat = intensitat;
	}

	public void modificaAtraccio(){
		codi = IOUtils.getStringInput("Entra el codi de la nova atraccio: \n");
		nom = IOUtils.getStringInput("Entra el nom de la nova atraccio: \n");
		altMinima = IOUtils.getIntInput("Entra l'alcada minima per poder puajr-hi: \n");
		intensitat = IOUtils.getIntInput("Entra la intensitat de la nova atraccio: \n");
	}

	public void setCodi(String codi){
		this.codi = codi;
	}

	public String getCodi(){
		return codi;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public String getNom(){
		return nom;
	}

	public void setAltMinima(int altMinima){
		this.altMinima = altMinima;
	}

	public int getAltMinima(){
		return altMinima;
	}

	public void setIntensitat(int intensitat){
		this.intensitat = intensitat;
	}

	public int getIntensitat(){
		return intensitat;
	}

	@Override
	public String toString(){
		return 	"Codi atraccio: "+codi+"\n"+
				"Nom atraccio: "+nom+"\n"+
				"Altura minima: "+altMinima+"\n"+
				"Intensitat atraccio: "+intensitat;
	}
}