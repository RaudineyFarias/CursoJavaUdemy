public class Tabuada {
    public static void main(String[] args) {
        for (int operador = 1 ; operador<=10; operador++ ){
            System.out.printf("***** Tabuada de %d *****", operador);
            for(int iterador = 1; iterador <=10; iterador++){
                System.out.printf("%d X %d = %d \n", operador,iterador, operador*iterador);
            }
            System.out.println("-----------------------");
        }
    }

}
