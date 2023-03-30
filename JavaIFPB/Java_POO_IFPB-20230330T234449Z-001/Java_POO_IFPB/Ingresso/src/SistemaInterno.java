import java.util.Scanner;

public class SistemaInterno {

    Scanner a = new Scanner(System.in);

    public void pedirIngresso(){
        System.out.println("Escolha um tipo de Ingresso: ");
        System.out.println ("1-Normal \n2-CamaroteInferior \n3-CamaroteSuperior");
        int categoria = 0;
        categoria = a.nextInt();
        categoria = veficacaoSeguranca(categoria);
        definirCategoria(categoria);
    }

    public int veficacaoSeguranca(int categoria){
        boolean condicao = categoria!=1&&categoria!=2&&categoria!=3;
        if(condicao){
            while (condicao){
                System.out.println("Digite o valor entre 1 e 3");
                categoria = a.nextInt();
                if(categoria==1 || categoria==2 || categoria==3){
                    condicao = false;
                }
            }
        }
        return categoria;
    }

    public void definirCategoria(int categoria){
        switch (categoria){
            case 1:
                Ingresso normal = new Normal();
                valor(normal);
                break;
            case 2:
                Ingresso camaroteInf = new CamaroteInferior();
                valor(camaroteInf);
                break;
            case 3:
                Ingresso camaroteSup = new CamaroteSuperior();
                valor(camaroteSup);
                break;
        }
    }

    public void valor(Ingresso ingresso){
        double valor = ingresso.valorFinal();
        System.out.println("O valor final do seu ingresso é: " + valor);
    }
}
