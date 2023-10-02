package PT1;

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
		// Declaramos teclado
		Scanner keyboard = new Scanner(System.in);
		
		// Recogemos primer numero
		System.out.println("Introduce el primer número: ");
		String datos_keyboard = keyboard.nextLine();
		// Comprueba si el dato no es un numero y solicita introducir dato otra vez
		while (!stringEsNumero(datos_keyboard)) {
			System.out.println("Numero incorrecto introduce el primer número otra vez: ");
			datos_keyboard = keyboard.nextLine();
		}
		//parseamos string a numero y reseteamos variable de datos_keyboard
		float num1 = Float.parseFloat(datos_keyboard);
		datos_keyboard = "";
		
		// Recogemos segundo numero
		System.out.println("Introduce el segundo número: ");
		datos_keyboard = keyboard.nextLine();
		// Comprueba si el dato no es un numero y solicita introducir dato otra vez
		while (!stringEsNumero(datos_keyboard)) {
			System.out.println("Numero incorrecto introduce el segundo número otra vez: ");
			datos_keyboard = keyboard.nextLine();
		}
		//parseamos string a numero y reseteamos variable de datos_keyboard
		float num2 = Float.parseFloat(datos_keyboard);
		datos_keyboard = "";
		
		//comprovamos cual de los numeros es mayor y mostramos respuesta
		if (num1 > num2) {
			System.out.println("El número " + num1 + " es mas grande que " + num2 + ".");
		} else if (num2 > num1) {
			System.out.println("El número " + num2 + " es mas grande que " + num1 + ".");
		} else {
			System.out.println("Los dos números son iguales.");
		}

	}
	
	public static boolean stringEsNumero(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numerico;
		
		//comprueba si el dato es numérico o no
		try {
			float numero = Float.parseFloat(datos_keyboard);
			es_numerico = true;
		} catch (Exception e) {
			es_numerico = false;
		}
		
		return es_numerico;
	}

}
