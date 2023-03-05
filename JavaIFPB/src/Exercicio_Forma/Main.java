package Exercicio_Forma;

public class Main {
	public static void main(String[] args) {
		Forma Retangulo = new Retangulo();
		Forma Circulo = new Circulo();
		
		Retangulo.CalcularArea();
		Retangulo.Desenhar();
		
		System.out.println("\n");
		
		Circulo.CalcularArea();
		Circulo.Desenhar();
	}
}
