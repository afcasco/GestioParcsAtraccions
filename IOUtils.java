import java.util.Scanner;

final class IOUtils{

	private IOUtils(){}

	public static final String[] MENU_PRINCIPAL = {"0. Sortir",
								"1. Gestio de parcs",
								"2. Gestio d'atraccions",
								"3. Gestio de botigues",
								"4. Gestio de restaurants"};

	public static final String[] MENU_PARCS = {"0. Sortir",
								"1. Alta nou parc",
								"2. Seleccionar parc",
								"3. Modificar parc",
								"4. Llista de parcs"};

	public static final String[] MENU_ATRACCIONS = {"0. Sortir",
								"1. Alta",
								"2. Modificar",
								"3. Llista d'atraccions"};

	public static final String[] MENU_BOTIGUES = {"0. Sortir",
								"1. Alta",
								"2. Modificar",
								"3. Llista de botigues"};

	public static final String[] MENU_RESTAURANTS = {"0. Sortir",
								"1. Alta",
								"2. Modificar",
								"3. Llista de restaurants"};

	public static int getIntInput(){
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static int getIntInput(String message){
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static String getStringInput(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}

	public static void mostrarMenuPrincipal(){

		for(String opcio : MENU_PRINCIPAL){
			System.out.println(opcio);
		}
	}

	public static void mostrarMenuParcs(){
		for(String opcio : MENU_PARCS){
			System.out.println(opcio);
		}
	}

	public static void mostrarMenuAtraccions(){
		for(String opcio : MENU_ATRACCIONS){
			System.out.println(opcio);
		}
	}

	public static void mostrarMenuBotigues(){
		for(String opcio : MENU_BOTIGUES){
			System.out.println(opcio);
		}
	}

	public static void mostrarMenuRestaurants(){
		for(String opcio : MENU_RESTAURANTS){
			System.out.println(opcio);
		}
	}
}