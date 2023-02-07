package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro Número");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo Número");
		System.out.println(valor1+valor2);

		double numero1 = Double.parseDouble(valor1); //Converter String para Número
		//Lembrando que nem toda String pode ser Numero
		double numero2 = Double.parseDouble(valor2);
		//para executar o swing é preciso adicionar a BIblioteca java 1.7
		double soma = numero1 + numero2;
		System.out.println("Soma é "+ soma);
		System.out.println("Média é "+soma /2);
	
	}
}
