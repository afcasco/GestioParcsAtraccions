import java.util.ArrayList;

public class Aplicacio {

	public static void main(String[] args) {

		ArrayList<Parc> parcs = new ArrayList<Parc>();
		Parc parc;
		int opcio;

		do {
			IOUtils.mostrarMenuPrincipal();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				gestionarParcs();
				break;
			case 2:
				gestionarAtraccions();
				break;
			case 3:
				gestionarBotigues();
				break;
			case 4:
				gestionarRestaurants();
				break;
			}
		} while(opcio!=0);

	}

	private static void gestionarParcs(Parc parc){
		int opcio;
		do{
			IOUtils.mostrarMenuParcs();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				parc = new Parc();
				break;
			case 2:
				parc = parcs.get(IOUtils.getIntInput("Selecciona el parc"));
				break;
			case 3:
				parc.modificarParc();
			}
		} while(opcio!=0);

	}

	private static void gestionarAtraccions(){
		int opcio;
		do{
			IOUtils.mostrarMenuAtraccions();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				parc.afegirAtraccio()
				break;
			case 2:
				// implementar modificar atraccio existent
				break;
			case 3:
				// implementar llistar atraccions d'un parc
				// removed class files
				break;
			}
		} while(opcio!=0);

	}

	private static void gestionarBotigues(){

	}

	private static void gestionarRestaurants(){

	}
}