import java.util.Scanner;

public class Botiga {

	private String codi;
	private String nom;
	private String productes;

	public Botiga(){
		codi = IOUtils.getStringInput("Entra el codi de la nova botiga: \n");
		nom = IOUtils.getStringInput("Entra el nom de la nova botiga: \n");
		productes = IOUtils.getStringInput("Entra el tipus de productes dels que disposa: \n");
	}

	public Botiga(String codi, String nom, String productes){
		this.codi = codi;
		this.nom = nom;
		this.productes = productes;
	}

	public void modificarBotiga(){
		codi = IOUtils.getStringInput("Entra el codi de la nova botiga: \n");
		nom = IOUtils.getStringInput("Entra el nom de la nova botiga: \n");
		productes = IOUtils.getStringInput("Entra el tipus de productes dels que disposa: \n");
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

	public void setProductes(String productes){
		this.productes = productes;
	}

	public String getProductes(){
		return productes;
	}

	@Override
	public String toString(){
		return 	"Codi botiga: "+codi+"\n"+
				"Nom botiga: "+nom+"\n"+
				"Tipus productes: "+productes;	
	}
}