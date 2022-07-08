public class Restaurant {
	
	private String codi;
	private String nom;
	private String menjar;
	private String espectacle;

	public Restaurant(){
		codi = IOUtils.getStringInput("Entra el codi del nou restaurant: \n");
		nom = IOUtils.getStringInput("Entra el nom del nou restaurant: \n");
		menjar = IOUtils.getStringInput("Entra el tipus de menjar que servira: \n");
		espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira: \n");
	}

	public Restaurant(String codi, String nom, String menjar, String espectacle){
		this.codi = codi;
		this.nom = nom;
		this.menjar = menjar;
		this.espectacle = espectacle;
	}

	public void modificarRestaurant(){
		codi = IOUtils.getStringInput("Entra el codi del nou restaurant: \n");
		nom = IOUtils.getStringInput("Entra el nom del nou restaurant: \n");
		menjar = IOUtils.getStringInput("Entra el tipus de menjar que servira: \n");
		espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira: \n");
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

	public void setMenjar(String menjar){
		this.menjar = menjar;
	}

	public String getMenjar(){
		return menjar;
	}

	public void setEspectacle(String espectacle){
		this.espectacle = espectacle;
	}

	public String getEspectacle(){
		return espectacle;
	}

	@Override
	public String toString(){
		return 	"Codi restaurant: "+codi+"\n"+
				"Nom restaurant: "+nom+"\n"+
				"Tipus de menjar: "+menjar+"\n"+
				"Espectacle oferit: "+espectacle;
	}
}
