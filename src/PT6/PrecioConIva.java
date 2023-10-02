package PT6;

import javax.swing.JOptionPane;

public class PrecioConIva {

	public static void main(String[] args) {
		// declaramos constante del IVA
		final double IVA = 1.21;
		
		// pedimos introducir precio de producto
		String datos_keyboard = JOptionPane.showInputDialog("Introduce el precio del producto.");
		
		// Comprueba si el dato no es un numero positivo y solicita introducir dato otra vez
		while (!stringEsNumeroPositivo(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("Datos no numéricos o negativos, introduce el precio del producto otra vez.");
		}
		
		//calculamos IVA del producto
		double precio_iva = Double.parseDouble(datos_keyboard) * IVA;
		
		// Mostramos mansaje de bienvenida
		JOptionPane.showMessageDialog(null, "El precio final del producto con iva es de " + precio_iva);

	}
	
	public static boolean stringEsNumeroPositivo(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numero_positivo;
		
		//comprueba si el dato es positivo y numérico o no
		try {
			double numero = Double.parseDouble(datos_keyboard);
			es_numero_positivo = true;
			if (numero < 0) {
				es_numero_positivo = false;
			}
		} catch (Exception e) {
			es_numero_positivo = false;
		}
		
		return es_numero_positivo;
	}

}
