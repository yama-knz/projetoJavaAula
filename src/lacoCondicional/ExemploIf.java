package lacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade < 18) {
			System.out.println("Você não pode dirigir.");
		}
		
	}

}
