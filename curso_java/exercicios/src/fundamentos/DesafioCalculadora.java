package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o Primeiro Numero: ");
		int num1 = entrada.nextInt();
		
		System.out.printf("Digite o Segundo Numero: ");
		int num2 = entrada.nextInt();
		
		System.out.printf("Insira qual o tipo de operação: ");
		String operador = entrada.next();
		
		String menor = "-";
		String maior = "+";
		String multiplicaçao = "*";
		String divisao = "/";
		String resto = "%";
		
		
		if (operador.equals(maior)){
			System.out.println(num1+num2);}
		
		if  (operador.equals(multiplicaçao)){
				System.out.println(num1*num2);}
					
		if (operador.equals(menor)){
			System.out.println(num1-num2);}
		
			
		if (operador.equals(divisao)){
			System.out.println(num1/num2);}

		if (operador.equals(resto)){
			//double result = num1+num2;
			//double resto2 = result%2=0;
			//String final = resto2 == true ? "Aprovado" : "Reprovado";
			
			System.out.println(num1%num2);}

			
		//int soma = num1+operador+num2;
		
		//System.out.println(num1+operador+num2);
		
		entrada.close();
		
		
	
		
	}
}
