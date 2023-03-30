public class Carro {

    String modelo;
    String cor;
    int ano;

    public Carro(String modelo, String cor, int ano ){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;

    }
    public void ligar(String modeloCarro){
        if (this.modelo.equals(modeloCarro)){
            System.out.println("O carro "+this.modelo+" Está ligado!");
        }else{
            System.out.println("Você Digitou o modelo errado!");
        }

    }



}
