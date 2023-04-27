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
			opcion = pedirInt("Por favor, seleccione la opción deseada:\n"
					+ "\\n1.Registra trabajo\n"
					+ "\\n2. Aumenta horas\n"
					+ "\\n3. Aumenta coste piezas\n"
					+ "\\n4. Finalizar trabajo\n"
					+ "\\n5. Muestra trabajo");
		}while(opcion > 1 || opcion < 6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taller taller = new Taller();

	}

}
