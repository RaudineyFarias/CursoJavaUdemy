package Exercicio_Forma;

public class Retangulo extends Forma {
	
	private double Lado1 = 1.25;
	private double Lado2 = 1.55;
	
	
	public void CalcularArea() {
		System.out.println("Area do Retangulo é: "+this.Lado1*this.Lado2+"m²");
		
	}
	
	public void Desenhar() {
		System.out.println("Desenhando Retangulo...");
		
	}
}
