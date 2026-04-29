package poo;

public class TestaCarro {

	public static void main(String[] args) {

		// Instanciamentp | Instanciar um objeto
		Carro c1 = new Carro("Honda", 2, 4, "d16z6");
		Carro c2 = new Carro("Toyota", 2, 4, "2Jz");
		
		// c1.marca = "Honda";
		// c1.portas = 2;
		
		// c1.setMarca("Honda");
 		// c1.setPortas(2);
		
		c1.mover();
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Qtd. Portas: " + c1.getPortas());
		System.out.println(c1.parar());
		
		System.out.println();
		
		System.out.println("Marca: " + c2.getMarca());
		System.out.println("Qtd. Portas: " + c2.getPortas());

	}

}
