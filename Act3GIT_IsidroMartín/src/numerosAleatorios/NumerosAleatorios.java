package numerosAleatorios;

public class NumerosAleatorios {

	private static int MAX		= 10;
	private static int MIN 		= 1;
	private static int CANTIDAD	= 40;
	private static int VALORES	= MAX - MIN + 1;
	
	public static void main(String[] args) {
		double rango	= 0;
		double numero	= 0;
		
		System.out.println("Numeros aleatorios entre " + MIN + " y " + MAX);
		System.out.println("-------------------------------");
		for(int i = 0; i < CANTIDAD; i++) {
			rango = Math.random();
			numero = rango * VALORES + MIN;
			System.out.println("Número " + (i+1) + ": " + (int) numero);
		}
	}

}
