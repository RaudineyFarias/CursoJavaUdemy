import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa Pessoa1 = new Pessoa();



        System.out.println("Digite o Nome: ");
        Pessoa1.setNome(sc.nextLine());
        System.out.println("Digite a idade De "+Pessoa1.getNome()+": ");
        Pessoa1.setIdade(sc.nextInt());
        System.out.println("Digitea cidade em que "+Pessoa1.getNome()+" mora: ");
        Pessoa1.setCidade(sc.next());


        System.out.println("Os dados informados foram: ");

        System.out.println("Nome: "+Pessoa1.getNome()+", A idade Digitada foi: "+Pessoa1.getIdade()+", A cidade que em você mora é: "+Pessoa1.getCidade());

    }
}
