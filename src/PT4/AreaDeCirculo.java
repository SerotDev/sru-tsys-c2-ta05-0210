package PT4;

import javax.swing.JOptionPane;

public class AreaDeCirculo {

	public static void main(String[] args) {
		// Mostramos panel para introducir nombre
		String datos_keyboard = JOptionPane.showInputDialog("Introduce el radio para calcular el area de su círculo.");
		
		// Comprueba si el dato no es un numero y solicita introducir dato otra vez
		while (!stringEsNumero(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("Datos no numéricos, introduce el radio otra vez.");
		}
		
		//parseamos radio y calculamos área del circulo
		double area = Math.PI * Math.pow(Double.parseDouble(datos_keyboard), 2);
		
		// Mostramos mansaje de bienvenida
		JOptionPane.showMessageDialog(null, "El area del círculo es " + area);

	}
	
	public static boolean stringEsNumero(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numerico;
		
		//comprueba si el dato es numérico o no
		try {
			double numero = Double.parseDouble(datos_keyboard);
			es_numerico = true;
		} catch (Exception e) {
			es_numerico = false;
		}
		
		return es_numerico;
	}

}
