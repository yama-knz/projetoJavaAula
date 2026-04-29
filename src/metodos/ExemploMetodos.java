package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {
	
	public static int somar (int n1, int n2) {	// Assinatura do Método
		// Lógica do Método
		return n1 + n2;
	}
	
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (void)");
	}
	
	public static void saudacao(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		int resultado = somar(2, 5);	// resultado = 7
		System.out.println("O primeiro resultado: "+ resultado);
		
		mensagem();
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info();

	}

}
