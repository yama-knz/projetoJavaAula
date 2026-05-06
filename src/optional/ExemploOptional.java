package optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {

		String[] palavras = new String[10];
		palavras[5] = "Turma";

		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);

		if (checaNulo.isPresent()) {	//Verifica se tem algo dentro de Optional. True/False
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else
			System.out.println("A palavra é nula!");

	}

}
