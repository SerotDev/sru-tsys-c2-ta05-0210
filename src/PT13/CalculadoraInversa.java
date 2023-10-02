package PT13;

import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		// declaramos varianles de los operadores
		int operador_1, operador_2, resultado_entero;
		
		// pedimos primer operador
		String datos_keyboard = JOptionPane.showInputDialog("Introduce 1r numero a operar.");
		while (!stringEsNumeroEntero(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("Datos incorrectos, introduce el 1r operante.");
		}
		operador_1 = Integer.parseInt(datos_keyboard);
		
		// pedimos segundo operador
		datos_keyboard = JOptionPane.showInputDialog("Introduce 2º numero a operar.");
		while (!stringEsNumeroEntero(datos_keyboard)) {
			datos_keyboard = JOptionPane.showInputDialog("Datos incorrectos, introduce el 2º operante.");
		}
		operador_2 = Integer.parseInt(datos_keyboard);
		
		//pedimos signo aritmético
		datos_keyboard = JOptionPane.showInputDialog("Introduce simbolo aritmético para realizar la operación. ( + - * / ^ % )");
		boolean simbolo_correcto = false;
		
		//comprobamos simbolo, si existe realizamos operaciones, si no existe pedimos simbolo aritmético otra vez
		while (!simbolo_correcto) {
			simbolo_correcto = true;
			
			switch (datos_keyboard) {
			case "+":
				resultado_entero = operador_1 + operador_2;
				JOptionPane.showMessageDialog(null, operador_1 + " + " + operador_2 + " = " + resultado_entero);
				break;
			case "-":
				resultado_entero = operador_1 - operador_2;
				JOptionPane.showMessageDialog(null, operador_1 + " - " + operador_2 + " = " + resultado_entero);
				break;
			case "*":
				resultado_entero = operador_1 * operador_2;
				JOptionPane.showMessageDialog(null, operador_1 + " * " + operador_2 + " = " + resultado_entero);
				break;
			case "/":
				double resultado_decimales = (double)operador_1 / (double)operador_2;
				JOptionPane.showMessageDialog(null, operador_1 + " / " + operador_2 + " = " + resultado_decimales);
				break;
			case "^":
				resultado_entero = (int) Math.pow(operador_1, operador_2);
				JOptionPane.showMessageDialog(null, operador_1 + " ^ " + operador_2 + " = " + resultado_entero);
				break;
			case "%":
				resultado_entero = operador_1 % operador_2;
				JOptionPane.showMessageDialog(null, operador_1 + " % " + operador_2 + " = " + resultado_entero);
				break;
			default:
				datos_keyboard = JOptionPane.showInputDialog("Datos incorrectos, introduce el simbolo aritmético.");
				simbolo_correcto = false;
				break;
			}
			
		}

	}
	
	public static boolean stringEsNumeroEntero(String datos_keyboard) {
		//variable para comprovar si es dato numérico o no
		boolean es_numero;
		
		//comprueba si el dato es int o no
		try {
			int numero = Integer.parseInt(datos_keyboard);
			es_numero = true;
		} catch (Exception e) {
			es_numero = false;
		}
		
		return es_numero;
	}

}
