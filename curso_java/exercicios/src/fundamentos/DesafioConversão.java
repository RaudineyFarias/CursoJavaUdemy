package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//replace serve para substituir um valor desejado 
		//nesse caso eu susbitui a Virgula pelo ponto
		//como está nas variáveis de String
		
		System.out.print("Digite seu primeiro Salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu segundo Salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu terceiro Salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double soma = s1+s2+s3;
		
		double media = (s1+s2+s3)/3;
		
		System.out.println("A soma dos três Salários é: "+soma);
		
		System.out.println("A média dos três Salários é: "+media);
		
		entrada.close();
	}
}
