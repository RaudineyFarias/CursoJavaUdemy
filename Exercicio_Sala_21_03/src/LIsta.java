import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIsta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> Lista = new ArrayList<String>();

        System.out.print("Digite o Nome: ");

        String Nome = sc.nextLine();

        Lista.add(Nome);

        adicionarElemento(Lista,"Hello");

        System.out.println(Lista);



    }
    public static void adicionarElemento(List<String> Lista,String elemento){
        Lista.add(elemento);
        Lista.add("World");
    }
}
