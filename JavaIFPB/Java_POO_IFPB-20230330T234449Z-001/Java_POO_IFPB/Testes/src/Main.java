import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        int cont = 0;
        while (!entrada.equals("sair")){
            cont ++;
            entrada = sc.nextLine();
        }
        System.out.println("Foram Digitados: "+cont+" palavras");
    }
}
