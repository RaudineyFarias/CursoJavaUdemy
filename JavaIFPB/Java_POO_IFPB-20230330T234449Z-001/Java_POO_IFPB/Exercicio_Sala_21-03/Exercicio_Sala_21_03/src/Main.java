import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        trocaValores(a,b);

        System.out.println("'A' Dentro do Metodo MAIN: " + a);

        System.out.println("'B' Dentro do  Metodo MAIN: " + b);

    }

    public static void trocaValores(int a, int b){
        Scanner sc = new Scanner(System.in);

        int c = a;

        a = b;

        b = c;

        System.out.println("'A' Dentro do Metodo TrocaValor: " + a);

        System.out.println("'B' Dentro do Metodo TrocaValor: " + b);

        System.out.println("----------------------------------");
    }
}