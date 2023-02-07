package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		
		System.out.println("\nBom dia!!!");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\nseu nome é: %s %s, e sua idade é: %d", nome, sobrenome, idade);
		
		entrada.close();
	}
}
