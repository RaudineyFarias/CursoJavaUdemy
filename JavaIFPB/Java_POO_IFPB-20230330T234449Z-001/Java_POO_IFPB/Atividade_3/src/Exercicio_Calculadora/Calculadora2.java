package Exercicio_Calculadora;

public class Calculadora2 {


    public Calculadora2(){

    }
    public static double soma(double num1, double num2){

        return num1+num2;
    }

    public static double multiplicacao(double num1, double num2){
        return num1*num2;

    }
    public static double divisao(double num1, double num2){
        return num1/num2;


    }
    public  static double subtracao(double num1, double num2){
        return num1-num2;

    }

}

/**
 * Código certo:
 * public class Main {
 *     public static void main(String[] args) {
 *         double numDigitado1;
 *         double numDigitado2;
 *         Scanner sc = new Scanner(System.in);
 * 	System.out.println("Digite o primeiro numero: ");
 *         numDigitado1 = sc.nextDouble();
 *         System.out.println("Digite o segundo numero: ");
 *         numDigitado2 = sc.nextDouble();
 * 	int operacao;
 *         System.out.println("Digite a operação: \n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão");
 *         operacao = sc.nextInt();
 *         double resultado;
 *      switch (operacao){
 *        case 1: resultado = Calculadora.soma(numDigitado1, numDigitado2);
 *              System.out.println("O resultado da soma foi " + resultado);
 *              break;
 *        case 2: resultado = Calculadora.subtracao(numDigitado1, numDigitado2);
 *              System.out.println("O resultado da subtração foi " + resultado);
 *              break;
 *        case 3: resultado = Calculadora.multiplicacao(numDigitado1, numDigitado2);
 *              System.out.printf("O resultado da multiplicação foi %.2f", resultado);
 *               break;
 *        case 4: resultado = Calculadora.divisao(numDigitado1, numDigitado2);
 *         System.out.printf("O resultado da divisão foi %.2f", resultado);
 *              break;
 *         default:
 *                 System.out.println("Operação Inválida");
 *         }
 *     }
 * }
 */
