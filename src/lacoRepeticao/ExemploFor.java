package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
			int i;
			String nome;
			Scanner scanner = new Scanner(System.in);
	        
			for (i = 1; i < 4; i++) {
				System.out.print("Digite o " + i +"º nome: ");
		        nome = scanner.nextLine();
		        System.out.printf("O "+ i +"º nome é: " + nome + "\n");
		        
			}
			 
	}

}
