package PT3;

import javax.swing.JOptionPane;

public class MensajeBienvenidaPorNombre {

	public static void main(String[] args) {
		// Mostramos panel para introducir nombre
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		// Mostramos mansaje de bienvenida
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + ", encantado de verte de nuevo.");
		
	}

}
