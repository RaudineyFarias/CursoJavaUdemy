package Palindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Palavra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra: ");

        Palavra = sc.next();

        if (VericadorPalindromo(Palavra)){
            System.out.println("É Palindromo!");

        }else {
            System.out.println("Não é Palindromo!");
        }
    }
    public static boolean VericadorPalindromo(String palavra){
        StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
        boolean resultado = palavraInvertida.toString().equals(palavra);
        return resultado;

    }
}
