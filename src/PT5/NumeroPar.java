package PT5;

import javax.swing.JOptionPane;

public class NumeroPar {

	public static void main(String[] args) {
		// Mostramos panel para introducir nombre
		String datos_keyboard = JOptionPane.showInputDialog("Introduce un número entero para ver si es par o impar.");
		
		// Comprueba si el dato no es un numero entero y solicita introducir dato otra vez
		while (!stringEsEntero(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("El dato introducido no es un número entero, introduce numero otra vez.");
		}
				
		//mostramos si es par o no
		if ((Integer.parseInt(datos_keyboard) % 2) == 0) {
			JOptionPane.showMessageDialog(null, "El número " + datos_keyboard + " es dibisible entre 2 y por tanto es un numero par.");
		} else{
			JOptionPane.showMessageDialog(null, "El número " + datos_keyboard + " no es dibisible entre 2 y por tanto es numero impar.");
		}

	}
			
	public static boolean stringEsEntero(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numerico;
				
		//comprueba si el dato es numérico o no
		try {
			int numero = Integer.parseInt(datos_keyboard);
			es_numerico = true;
				} catch (Exception e) {
			es_numerico = false;
		}
				
		return es_numerico;
		
	}

}
