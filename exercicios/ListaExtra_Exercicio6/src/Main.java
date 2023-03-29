import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        double raio = sc.nextDouble();

        Circulo c = new Circulo(raio);

        double area = 3.14*( raio*raio);

        System.out.printf("O valor da área foi: %.4f", c.getArea());
    }
}
