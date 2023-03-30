public class main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1594, 150.00, "Raudiney");
        ContaBancaria c2 = new ContaBancaria(3082, 150.00, "João");


        c1.depositar(450.00);
        System.out.println("O seu novo Saldo "+c1.titular+" depois do deposito "+c1.Saldo);
        c2.depositar(300.00);
        System.out.println("O seu novo Saldo "+c2.titular+" depois do deposito "+c1.Saldo);
    }
}
