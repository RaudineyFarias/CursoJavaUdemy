package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de sua média: ");
		String media_entrada = entrada.nextLine();
		
		double media = Double.parseDouble(media_entrada);
		String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
		
		System.out.println("O aluno está "+ resultado);
		
		entrada.close();
		
	}

}
