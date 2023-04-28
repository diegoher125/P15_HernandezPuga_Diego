package main.java.ieseuropa;

import java.util.Scanner;

public class P15_HernandezPuga_Diego {
	
	private static String pedirString(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		return teclado.nextLine();
	}

	private static int pedirInt(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextInt();
	}
	
	private static float pedirFloat(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextFloat();
	}
	
	private static void inicio(Taller taller) {
		int opcion = 0;
		do {
			opcion = pedirInt("Por favor, seleccione la opción deseada:"
					+ "\n1.Registra trabajo"
					+ "\n2. Aumenta horas"
					+ "\n3. Aumenta coste piezas"
					+ "\n4. Finalizar trabajo"
					+ "\n5. Muestra trabajo");
			menuPrincipal(taller, opcion);
		}while(opcion > 0 && opcion < 6);
	}
	
	private static void menuPrincipal(Taller taller, int opcion) {
		switch(opcion) {
		case 1:
			int tipo = pedirInt("Por favor, introduzca el tipo de trabajo (1 mecánica, 2 chapa, 3 revisión)");
			System.out.println(taller.nuevoTrabajo(pedirString("Por favor, introduzca la descripción:"), tipo));
			break;
		case 2:
			System.out.println(taller.aumentarHorasTrabajo(pedirInt("Por favor, introduzca el identificador del trabajo:"), pedirHoras()));
			break;
		case 3:
			System.out.println(taller.aumentarCostePiezasTrabajo(pedirInt("Por favor, introduzca el identificador del trabajo:"), pedirCoste()));
			break;
		case 4:
			System.out.println(taller.finalizarTrabajo(pedirInt("Por favor, introduzca el identificador del trabajo:")));
			break;
		case 5:
			System.out.println(taller.muestraTrabajo(pedirInt("Por favor, introduzca el identificador del trabajo:")));
			break;
		}
	}
	
	private static int pedirHoras() {
		int horas = 0;
		do {
			horas = pedirInt("Por favor, introduzca el número de horas:");
			if(horas < 1) {
				System.out.println("ERROR: El numero de horas aumentadas no puede ser menor de 1");
			}
		}while(horas < 1);
		return horas;
	}
	
	private static float pedirCoste() {
		float coste = 0;
		do {
			coste = pedirFloat("Por favor, introduzca el coste de las piezas:");
			if(coste < 1) {
				System.out.println("ERROR: El coste aumentado no puede ser menor de 1");
			}
		}while(coste < 1);
		return coste;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taller taller = new Taller();
		inicio(taller);
		System.out.println("Adios!");
	}

}
