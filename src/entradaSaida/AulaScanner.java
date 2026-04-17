package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Bom dia, " + nome);

	}

}
