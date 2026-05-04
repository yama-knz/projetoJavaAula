package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		// Pessoa p = new Pessoa("Maria", 18); // Classes Abstratas não podem ser instanciadas
		// p.visualizar();

		TriAtleta t1 = new TriAtleta("Eliane", 26, 400);
		TriAtleta t2 = new TriAtleta("João", 30, 12);

		t1.visualizar();
		t2.visualizar();

	}

}

/*
	Aula de Hoje:
	
		Polimorfismo → mesmo método, comportamentos diferentes
		Sobrecarga → mesmo método, parâmetros diferentes
		Sobrescrita → mudar método da classe mãe
		Interface → contrato que obriga implementar métodos
*/