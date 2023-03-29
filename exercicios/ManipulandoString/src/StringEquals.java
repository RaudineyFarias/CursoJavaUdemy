import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada = "";

        int cont = 0;
        while (!entrada.equals("sair")){
            cont ++;
            entrada = sc.nextLine();
        }
        /**
         * O equals compara de forma correta as strings, pois ele compara as referências.
         *
         */
        System.out.println("Foram Digitados: "+cont+" palavras");
        System.out.println("Foram Digitados: "+cont+" palavras");
    }
}
