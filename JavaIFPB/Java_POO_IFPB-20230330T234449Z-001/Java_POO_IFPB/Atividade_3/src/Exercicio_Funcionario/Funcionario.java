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
    public double aumentarsalario(double valor){
        return double v = ((this.salario *100) / valor)+this.salario;
    }
    public String ToString(){
        return  "Nome: "+getNome()+"\nCargo:"+getCargo()+"\nSalario"+getSalario();
    }
}
