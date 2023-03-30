public class Pessoa {
        //variaveis
        String nome;
        int idade;
        String sexo;

        //construtor
        public Pessoa(String nome, int idade, String sexo ){
            this.nome  = nome;
            this.idade = idade;
            this.sexo = sexo;
        }
    /**
     * O metodo tem um tipo de retorno (int, string ...) nome metodo (lista
     *
     *
     */

        //métodos
        void ExibirInformacoes(){

            System.out.println("\nNome : " + this.nome );
            System.out.println("Idade : "+ this.idade);
            System.out.println("Sexo  : "+ this.sexo);


    };

}
