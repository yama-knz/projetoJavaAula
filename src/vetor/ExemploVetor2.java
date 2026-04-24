package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		//Criando a vetor vazia com 3 posições
		int vetorNumeros[] = new int [3];
		Scanner scanner = new Scanner (System.in);
		
		//Adicionando dados no vetor
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			vetorNumeros[i] = scanner.nextInt();
		}
		
		//Mostrando os dados do vetor
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println((i + 1) + "º elemento: " + vetorNumeros[i]);
		}

	}

}
