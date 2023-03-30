public class Animal {
    String nome;
    int idade;
    String especie;


    public Animal(String nome, int idade, String especie){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;

    }

    public void EmitirSom(String nome){
        if (this.nome.equals(nome="Leão")){
            System.out.println("Esse animal emite o som de rugido");
        }else{
            System.out.println("Você digitou o animal errado!");
        }
    }

}
