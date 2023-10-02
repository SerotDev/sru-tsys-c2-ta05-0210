package PT11;

import javax.swing.JOptionPane;

public class DiaLaboral {

	public static void main(String[] args) {
		//repetimos siempre que el usuario introduzca mal el día
		boolean datos_correctos = false;
		while (!datos_correctos) {
			datos_correctos = true;
			
			// pedimos introducir día de la semana
			String datos_keyboard = JOptionPane.showInputDialog("Introduce dia de la semana. (ej: Miércoles)");
			
			//validamos dia de la semana pasando a mayúsculas para validar mas tipos de entradas
			switch (datos_keyboard.toUpperCase()) {
			case "LUNES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "MARTES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "MIÉRCOLES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "MIERCOLES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "JUEVES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "VIERNES":
				JOptionPane.showMessageDialog(null, "Día laboral.");
				break;
			case "SÁBADO":
				JOptionPane.showMessageDialog(null, "Día festivo.");
				break;
			case "SABADO":
				JOptionPane.showMessageDialog(null, "Día festivo.");
				break;
			case "DOMINGO":
				JOptionPane.showMessageDialog(null, "Día festivo.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Día de la semana introducido incorrectamente.");
				datos_correctos = false;
				break;
			}
			
		}
		
	}

}
