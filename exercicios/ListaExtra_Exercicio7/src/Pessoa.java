public class Pessoa {
    private String Nome;
    private int Idade;

    public Pessoa(){
        String Nome;
        int Idade;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public String Nome(){
        return this.Nome;
    }
    public int Idade(){
        return this.Idade;
    }
}
