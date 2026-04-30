package pooHeranca;

// Classe Filha / Classe Derivada
public class Estudante extends Pessoa {

	private String matricula;
	private String curso;
	
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // super => Classe Mãe | Método construtor da Classe Mãe (Pessoa(nome, idade, email))
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
