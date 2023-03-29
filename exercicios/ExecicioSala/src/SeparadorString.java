import java.util.Scanner;

public class SeparadorString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Seu Nome: ");
        String nome = sc.next();

        String[] Resultado = nome.split(" ");

        System.out.println("Resultado: "+Resultado[0]);
    }

}