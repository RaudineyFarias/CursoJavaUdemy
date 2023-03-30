public abstract class Ingresso {
    private double valor = 100.00;
    private int categoria;

    //metodo para definição do preço
    public abstract double valorFinal();

    //get and set valor
    public double getValor(){
        return this.valor;
    }
    public void setValor(double novoValor){
        this.valor = novoValor;
    }
    // get and set de categoria
    public int getCategoria(){
        return this.categoria;
    }
    public void setCategoria(int novaCategoria){
        this.categoria = novaCategoria;
    }


}
