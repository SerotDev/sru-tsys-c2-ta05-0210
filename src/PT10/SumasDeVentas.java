package PT10;

import javax.swing.JOptionPane;

public class SumasDeVentas {

	public static void main(String[] args) {
		// pedimos introducir cantidad de ventas
		String datos_keyboard = JOptionPane.showInputDialog("Cuantos productos vendidos quieres introducir?");
		
		// Comprueba si el dato no es un numero positivo y solicita introducir dato otra vez
		while (!stringEsNumeroEnteroPositivo(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("Datos no numéricos enteros o negativos, introduce la cantidad de ventas que quieres introducir.");
		}
		int ventas = Integer.parseInt(datos_keyboard);
		
		//pedimos precio por cada venta y sumamos el total
		double total = 0;
		String texto_total = "";
		for (int i = 1; i <= ventas; i++) {
			datos_keyboard = JOptionPane.showInputDialog("Introduce el precio de la venta nº" + i + ".");
			while (!stringEsNumeroDecimalesPositivo(datos_keyboard)) {
				datos_keyboard = JOptionPane.showInputDialog("Datos no numéricos decimales o negativos, introduce el precio de la venta nº" + i + ".");
			}
			total += Double.parseDouble(datos_keyboard);
			//guardamos precios de cada venta en un string
			if (ventas != i ) {
				texto_total += datos_keyboard + " + ";
			} else {
				texto_total += datos_keyboard + " = " + total;
			}
		}
		
		// Mostramos el total
		JOptionPane.showMessageDialog(null, "El precio total de los productos es de " + total + " . Desglose: \t" + texto_total);

	}
	
	public static boolean stringEsNumeroDecimalesPositivo(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numero_positivo;
		
		//comprueba si el dato es positivo y numérico decimal o no
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
	
	public static boolean stringEsNumeroEnteroPositivo(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numero_positivo;
		
		//comprueba si el dato es positivo y numérico entero o no
		try {
			int numero = Integer.parseInt(datos_keyboard);
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
