package PT12;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class PedirPassword {

	public static void main(String[] args) {
		//declaramos constantes de la contraseseña, las veces a introducir la contraseña
		final String password = "contraseña";
		final int peticiones = 3;
		
		//creamos acceso para pedir la contraseña hasta 3 veces
		
		for (int i = 0; i < peticiones; i++) {
			// pedimos introducir día de la semana
			String datos_keyboard = JOptionPane.showInputDialog("Introduce contraseña:");
			
			if (datos_keyboard.equals(password)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				i = peticiones;
			}
			
		}

	}

}
