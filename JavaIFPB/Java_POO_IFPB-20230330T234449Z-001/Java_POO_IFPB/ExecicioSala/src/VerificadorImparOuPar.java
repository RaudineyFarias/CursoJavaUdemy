import java.util.Scanner;

public class VerificadorImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero;

        System.out.println("Digite o primeiro numero: ");
        Numero= sc.nextInt();

        if ((Numero % 2)==0){
            System.out.println("O numero "+Numero+" é Par");
        }else
        System.out.println("O numero "+Numero+" é Impar");


    }
}
