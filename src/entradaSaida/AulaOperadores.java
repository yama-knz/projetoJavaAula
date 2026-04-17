package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float celsius, fahrenheit;
		
		System.out.println("Informe a temperatura em Celsius: ");
		celsius = scanner.nextFloat();
		
		fahrenheit = celsius * 1.8f + 32;
		
		System.out.println("A temperatura em Fahrenheit é: "+ fahrenheit+ "F°");

	}

}
