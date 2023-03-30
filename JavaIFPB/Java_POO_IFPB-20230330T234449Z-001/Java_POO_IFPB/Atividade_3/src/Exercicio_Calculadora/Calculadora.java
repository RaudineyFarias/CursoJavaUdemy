package Exercicio_Calculadora;


import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o limite Minimo: ");
            int LimiteMin = sc.nextInt();

            System.out.println("Digite o limite máximo: ");
            int LimiteMax = sc.nextInt();

            System.out.println("Digite o operador: ");
            String Caracter = sc.next();

            if(Caracter.equals("*")) {
                for (int operador = LimiteMin; operador <= LimiteMax; operador++) {
                    System.out.printf("***** Tabuada de %d *****\n", operador);
                    for (int iterador = 1; iterador <= 10; iterador++) {
                        System.out.printf("%d X %d = %d \n", operador, iterador, operador * iterador);
                    }
                    System.out.println("-----------------------");

                }
            }else if (Caracter.equals("+")) {
                for (int operador = LimiteMin; operador <= LimiteMax; operador++) {
                    System.out.printf("***** Tabuada de %d *****\n", operador);
                    for (int iterador = 1; iterador <= 10; iterador++) {
                        System.out.printf("%d + %d = %d \n", operador, iterador, operador + iterador);
                    }
                    System.out.println("-----------------------");

                }
            }else if(Caracter.equals("-")) {
                for (int operador = LimiteMin; operador <= LimiteMax; operador++) {
                    System.out.printf("***** Tabuada de %d *****\n", operador);
                    for (int iterador = 1; iterador <= 10; iterador++) {
                        System.out.printf("%d - %d = %d \n", operador, iterador, operador - iterador);
                    }
                    System.out.println("-----------------------");

                }
            }else if(Caracter.equals("/")){
                for (int operador = LimiteMin ;operador<= LimiteMax; operador++ ){
                    System.out.printf("***** Tabuada de %d *****\n", operador);
                    for(int iterador = 1; iterador <=10; iterador++){
                        int divisao = operador%iterador;
                        System.out.printf("***** %d / %d = %s,%d ******** \n", operador,iterador, (operador/iterador),divisao);
                    }
                    System.out.println("-----------------------");
                }

            }
        }
    }

