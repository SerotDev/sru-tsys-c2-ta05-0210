package PT2;

import java.util.Scanner;

public class MensajeBienvenida {

	public static void main(String[] args) {
		// Declaramos teclado
		Scanner keyboard = new Scanner(System.in);
		
		// Recogemos apellido
		System.out.println("Introduce tu apellido: ");
		String apellido = keyboard.nextLine();
		
		//Mostramos mensaje
		System.out.println("Bienvenido " + apellido);
		
	}

}
