package Exercicio_Forma;


public class Circulo extends Forma{
	
    int a = 4;
    double pi = Math.PI;
    double area = pi * a * a;
    double perimeter = 2 * pi * a;
	
	public void CalcularArea() {
		
        System.out.println("Área do círculo: " + area+"m²");
        System.out.println("Perímetro do círculo: " + perimeter+"m²");
		
		
	}
	public void Desenhar() {
		System.out.println("Desenhando Circulo...");
	}

}
