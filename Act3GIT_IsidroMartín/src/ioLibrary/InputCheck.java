package ioLibrary;

import java.util.Scanner;

public class InputCheck {
	public int inputCheckInt(String data, Scanner lectura) {
		//Inicializamos variables
		int input			= -1;
		boolean	correct		= false;
		
		//Manejo de excepciones
		do {
			System.out.print(data);
			try {
				input = Integer.parseInt(lectura.nextLine());
				correct = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR. El dato introducido no es un número entero válido");
				System.out.println("--------------------------------------------------------");
			}
		} while (correct == false);
		
		return input;
	}
	public double inputCheckDouble(String data, Scanner lectura) {
		//Inicializamos variables
		double input		= -1;
		boolean	correct		= false;
		
		//Manejo de excepciones
		do {
			System.out.print(data);
			try {
				input = Double.parseDouble(lectura.nextLine());
				correct = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR. El dato introducido no es un número entero válido");
				System.out.println("--------------------------------------------------------");
			}
		} while (correct == false);
		
		return input;
	}
}
