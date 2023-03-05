package Exercicio_Veiculo;

public class Main {
	
	public static void main(String[] args) {
		Veiculo Moto = new Moto();
		Veiculo Carro = new Carro();
		
		System.out.println("Funções Moto\n");
		Moto.Acelerar();
		Moto.Frear();
		Moto.Virar();
		

		System.out.println("\nFunções Carro\n");
		
		Carro.Acelerar();
		Carro.Frear();
		Carro.Virar();
		
	}
	
}
