import java.util.ArrayList;

public class Aplicacio {

	private static ArrayList<Parc> parcs = new ArrayList<Parc>();
	private static Parc parc=null;

	public static void main(String[] args) {


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

	private static void gestionarParcs(){
		int opcio;
		do{
			IOUtils.mostrarMenuParcs();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				parcs.add(new Parc());
				break;
			case 2:
				parc = parcs.get(IOUtils.getIntInput("index del parc a seleccionar:"));
				break;
			case 3:
				parc.modificarParc();
				break;
			case 4:
				// llistar parcs
				break;
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
				parc.afegirAtraccio();
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
		int opcio;
		do{
			IOUtils.mostrarMenuBotigues();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				parc.afegirBotiga();
				break;
			case 2:
				// implementar modificar atraccio existent
				break;
			case 3:
				// implementar llistar atraccions d'un parc
				break;
			}
		} while(opcio!=0);

	}

	private static void gestionarRestaurants(){
		int opcio;
		do{
			IOUtils.mostrarMenuRestaurants();
			opcio = IOUtils.getIntInput();
			switch(opcio){
			case 1:
				parc.afegirRestaurant();
				break;
			case 2:
				// implementar modificar restaurant existent
				break;
			case 3:
				// implementar llistar restaurants d'un parc
				break;
			}
		} while(opcio!=0);

	}
}