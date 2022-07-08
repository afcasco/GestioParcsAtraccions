public class Restaurant extends Serveis {

	private String espectacle;

	public Restaurant(){
		super();
		espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
	}

	public Restaurant(String codi, String nom, String tipus, String espectacle){
		this.codi = codi;
		this.nom = nom;
		this.tipus = tipus;
		this.espectacle = espectacle;
	}

	public void modificarRestaurant(){
		codi = IOUtils.getStringInput("Entra el codi del nou restaurant:");
		nom = IOUtils.getStringInput("Entra el nom del nou restaurant:");
		tipus = IOUtils.getStringInput("Entra el tipus de menjar que servira:");
		espectacle = IOUtils.getStringInput("Entre l'espectacle que oferira:");
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

	public void setTipus(String tipus){
		this.tipus = tipus;
	}

	public String getTipus(){
		return tipus;
	}

	public void setEspectacle(String espectacle){
		this.espectacle = espectacle;
	}

	public String getEspectacle(){
		return espectacle;
	}

	@Override
	public String toString(){
		return "Codi restaurant: " + codi + "\n" +
			   "Nom restaurant: " + nom + "\n" +
			   "Tipus de menjar: " + tipus + "\n" +
			   "Espectacle oferit: " + espectacle;
	}
}
