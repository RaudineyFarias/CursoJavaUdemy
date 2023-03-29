public class Produto {
    private double Valor;

    public Produto(){
        double Desconto;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double desconto) {
        Valor = desconto;
    }
    public double NovoValor(){
        return Valor-(Valor*0.1);
    }
}
