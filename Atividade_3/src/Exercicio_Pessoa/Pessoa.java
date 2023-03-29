public class Pessoa {
    private String Nome;
    private int Idade;
    private String Cidade;


    public Pessoa(String Nome, int Idade, String Cidade){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Cidade = Cidade;
    }
    public  Pessoa(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }
}
