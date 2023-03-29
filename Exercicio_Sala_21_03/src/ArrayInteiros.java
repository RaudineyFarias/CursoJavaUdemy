import java.util.Arrays;
import java.util.Scanner;


public class ArrayInteiros {

    public static void main(String[] args) {

        Integer[] arrayInteros = {1, 2, 3};

        dobraValor(arrayInteros, 1);

        System.out.println(Arrays.toString(arrayInteros));
    }
    public static void dobraValor(Integer[] arrayinteros, int index){

        Scanner sc = new Scanner(System.in);

        //arrayinteros[index] *= 2;

        System.out.print("Digite um número para Multiplicar: ");

        arrayinteros[index] *= sc.nextInt();

        //arrayinteros[index] = arrayinteros[index]*2;

    }

}

