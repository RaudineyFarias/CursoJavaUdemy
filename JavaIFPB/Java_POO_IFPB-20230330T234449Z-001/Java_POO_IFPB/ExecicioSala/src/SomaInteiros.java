import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, Resultado;

        System.out.print("Digite o primeiro numero Inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Digite o Segundo numero Inteiro: ");
        num2 = sc.nextInt();

        Resultado = num1+num2;

        System.out.println("O resultado da soma é: "+ Resultado);

    }
}
