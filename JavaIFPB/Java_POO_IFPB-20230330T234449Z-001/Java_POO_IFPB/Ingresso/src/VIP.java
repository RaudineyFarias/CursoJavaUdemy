public class VIP extends Ingresso {
    private double adicional = 1.25;
    public double valorFinal() {
        double novoValorIngresso;
        novoValorIngresso = getValor()*getAdicional();
        return novoValorIngresso;
    }
    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
