public class Circulo {
    private double raio;
    public double perimetro ;
    public double area ;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea(){
        //return Math.PI*(Math.pow(raio,2));
        return (this.raio*this.raio)*3.14;


    }
    public double getPerimetro(){
        return 2*Math.PI*this.raio;
    }
}
