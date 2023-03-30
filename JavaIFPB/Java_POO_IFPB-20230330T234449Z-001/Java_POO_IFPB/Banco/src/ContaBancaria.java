public class ContaBancaria {

    int NumConta;
    double Saldo;
    String titular;

    public ContaBancaria(int NumConta, double Saldo, String titular) {

        this.NumConta = NumConta;
        this.Saldo = Saldo;
        this.titular = titular;
    }

    //Contrutor
    void ExibirInformacoes(){
        System.out.println("\nNumero da Conta: "+NumConta);
        System.out.println("Saldo Da conta: "+Saldo);
        System.out.println("Nome do Titular: "+titular);
    };

    public void sacar(double valor){
        if (this.Saldo > valor){
            this.Saldo = this.Saldo-valor;
        }else{
            System.out.println("EStá liso");

        }
    }
    public void depositar(double valor){
        this.Saldo = this.Saldo +valor;
    }
    public double VerSaldo(){
        return this.Saldo;

    }
}
