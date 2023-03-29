import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto Valor = new Produto();

        System.out.println("Digite o Valor do produto");

        Valor.setValor(sc.nextDouble());//Nesse Código O Usuário pode digitar com vírgula

        System.out.println("O Valor Do produto com desconto é :"+Valor.NovoValor());

    }
}
