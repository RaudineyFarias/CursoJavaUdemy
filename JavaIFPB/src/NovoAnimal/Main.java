package NovoAnimal;

public class Main {
    public static void main(String[] args) {
        Animal_Pai caramelo = new Cachorro();
        Animal_Pai garfield = new Gato();
        Animal_Pai bemTeVi = new Passaro();

        caramelo.emitirSom();
        garfield.emitirSom();
        bemTeVi.emitirSom();
        //caramelo.matricula();
    }
}