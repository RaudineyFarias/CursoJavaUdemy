public class CamaroteSuperior extends VIP{

    private double adicionalSup = 1.5;

    public double valorFinal(){
        return super.valorFinal()*getAdicionalSup();
    }
    public double getAdicionalSup() {
        return adicionalSup;
    }
    public void setAdicionalSup(double adicionalSup) {
        this.adicionalSup = adicionalSup;
    }
}
