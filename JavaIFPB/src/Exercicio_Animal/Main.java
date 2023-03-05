package Exercicio_Animal;

public class Main {
	public static void main(String[] args) {
		Animal nino = new Gato();
		Animal toto = new Cachorro();
		
		nino.comer();
		nino.dormir();
		
		System.out.println("\n");
		
		toto.comer();
		toto.dormir();
	}

}
