public class Main {
    public static void main(String[] args) {
        Animal caramelo = new Cachorro();
        Animal garfield = new Gato();
        Animal bemTeVi = new Passaro();

        caramelo.emitirSom();
        garfield.emitirSom();
        bemTeVi.emitirSom();
    }
}