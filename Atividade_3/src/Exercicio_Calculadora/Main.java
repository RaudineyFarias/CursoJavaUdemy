package Exercicio_Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numDigitado1;
        double numDigitado2;
        Scanner sc = new Scanner(System.in);
        int continuar = 0;
        do {
            System.out.println("Digite o primeiro numero: ");
            numDigitado1 = sc.nextDouble();
            System.out.println("Digite o segundo numero: ");
            numDigitado2 = sc.nextDouble();
            int operacao = 0;
            while((operacao<=0) || (operacao>=5)) {
                System.out.println("Digite a operação: \n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão");
                operacao = sc.nextInt();
            }
            double resultado;
            switch (operacao) {
                case 1:
                    resultado = Calculadora2.soma(numDigitado1, numDigitado2);
                    System.out.println("O resultado da soma foi " + resultado);
                    break;
                case 2:
                    resultado = Calculadora2.subtracao(numDigitado1, numDigitado2);
                    System.out.println("O resultado da subtração foi " + resultado);
                    break;
                case 3:
                    resultado = Calculadora2.multiplicacao(numDigitado1, numDigitado2);
                    System.out.printf("O resultado da multiplicação foi %.2f\n", resultado);
                    break;
                case 4:
                    resultado = Calculadora2.divisao(numDigitado1, numDigitado2);
                    System.out.printf("O resultado da divisão foi %.2f\n", resultado);
                    break;
                default:
                    System.out.println("Operação Inválida");
            }
            System.out.println("Deseja continuar? 1-SIM ou 0-NÃO");
            continuar = sc.nextInt();
        }while(continuar==1);

        System.out.println("Fim da operação" +
                "");
    }
}

/**
 * Atv 2)
 * public class Calculadora {
 *     public double soma(double num1, double num2){
 *         double resultado;
 *         resultado = num1+num2;
 *         return resultado;
 *     }
 *     public double subtracao(double num1, double num2){
 *         double resultado;
 *         resultado = num1-num2;
 *         return resultado;
 *     }
 *     public double multiplicacao(double num1, double num2){
 *         return num1*num2;
 *     }
 *     public double divisao(double num1, double num2){
 *         return num1/num2;
 *     }
 * }
 */


