import java.util.Scanner;

public class Botiga extends Serveis {

	public Botiga(){
		codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
		nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
		tipusProductes = IOUtils.getStringInput("Entra el tipus de tipusProductes dels que disposa:");
	}

	public Botiga(String codi, String nom, String tipusProductes){
		this.codi = codi;
		this.nom = nom;
		this.tipusProductes = tipusProductes;
	}

	public void modificarBotiga(){
		codi = IOUtils.getStringInput("Entra el codi de la nova botiga:");
		nom = IOUtils.getStringInput("Entra el nom de la nova botiga:");
		tipusProductes = IOUtils.getStringInput("Entra el tipus de tipusProductes dels que disposa:");
	}

	public void setProductes(String tipusProductes){
		this.tipusProductes = tipusProductes;
	}

	public String getProductes(){
		return tipusProductes;
	}

	@Override
	public String toString(){
		return 	"Codi botiga: "+codi+"\n"+
				"Nom botiga: "+nom+"\n"+
				"Tipus tipusProductes: "+tipusProductes;	
	}
}