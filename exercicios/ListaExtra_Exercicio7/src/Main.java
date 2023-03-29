import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa nome = new Pessoa();
        Pessoa Idade = new Pessoa();
        System.out.println("Digite O seu Nome");
        nome.setNome(sc.next());
        System.out.println("Digite a sua idade");
        Idade.setIdade(sc.nextInt());

        System.out.println("Olá "+nome.Nome()+" Seja Bem Vindo "+
                "Já Sei que Sua Idade é:  "+Idade.Idade());
    }
}
