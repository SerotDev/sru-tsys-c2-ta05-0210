package PT9;

public class ForDeCienDivisibles {

	public static void main(String[] args) {
		// for de 100
		for (int i = 1; i <= 100; i++) {
			
			//si es divisible entre 2 y 3
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		
		}
	}

}
