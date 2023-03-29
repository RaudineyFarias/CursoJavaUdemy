package Exercicio_Funcionario;

public class Funcionario {
    private String Nome;
    private double salario;
    private String Cargo;
    private double valor;

    public Funcionario(String Nome, double salario, String Cargo){
        this.Nome = Nome;
        this.salario = salario;
        this.Cargo = Cargo;
    }
    public Funcionario(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {

        Cargo = cargo;
    }
    public double aumentaSalario(double taxaDeAumento){
        return this.salario = this.salario + ((this.salario * taxaDeAumento / 100) );

    }
    public String ToString(){
        return  "Nome: "+getNome()+"\n Cargo: "+getCargo()+"\n Salario: "+getSalario();
    }
}
