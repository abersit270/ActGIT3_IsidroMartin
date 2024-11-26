package numerosCheck;

import ioLibrary.InputCheck;
import ioLibrary.ScreenPrint;
import java.util.Scanner;

public class NumbersBetween {

	public static void main(String[] args) {
		//Inicializacion de variables
		Scanner lectura 		= new Scanner(System.in);
		ScreenPrint pantalla	= new ScreenPrint();
		InputCheck check		= new InputCheck();
		int minimo				= 0;
		int maximo				= 0;
		int inter				= 0;
		int numberCheck			= 0;
		boolean isIguales		= false;
		
		//Inicio del programa
		System.out.println("Números enteros entre dos valores multiplos de 7");
		System.out.println("------------------------------------------------");
		
		
		do {
			//Leemos los valores
			minimo = check.inputCheckInt("Introduce un valor: ", lectura);
			maximo = check.inputCheckInt("Introduce un valor: ", lectura);
			numberCheck = check.inputCheckInt("Introduce un valor a comprobar: ", lectura);
			
			if(minimo != maximo) {
				isIguales = false;
				//Ordenamos los valores introducidos
				if(minimo > maximo) {
					inter = maximo;
					maximo = minimo;
					minimo = inter;	
				}
				
				System.out.println("Valores resultantes");
				for(int i = minimo; i <= maximo; i+=7) {
					if(i == minimo) {
						System.out.println("Valor inferior: " + i);
					} else {
						System.out.println("Más siete: " + i);
					}
				}
				
			} else {
				System.out.println("Los numeros son iguales");
				isIguales = true;
				pantalla.pressEnter(lectura);
			}
		} while (isIguales == true);
		
		if (minimo <= numberCheck && maximo >= numberCheck)
			System.out.println("El valor " + numberCheck + " esta entre " + minimo + " y " + maximo + ".");
		lectura.close();
	}

}
