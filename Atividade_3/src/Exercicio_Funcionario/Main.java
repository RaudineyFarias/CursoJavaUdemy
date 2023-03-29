package Exercicio_Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        Double salario;
        String cargo;

        Scanner sc = new Scanner(System.in);



        System.out.println("Digite O Nome do Funcionário: ");
        nome = sc.nextLine();

        System.out.println("Digite O Salário do Funcionário: ");
        salario = sc.nextDouble();

        System.out.println("Digite O cargo do Funcionário: ");
        cargo = sc.next();

        Funcionario Raudiney = new Funcionario(nome,salario, cargo);

        System.out.println("Digite o Valor do aumento em forma de porcentagem: ");

        double NovoSalario = Raudiney.aumentaSalario(sc.nextDouble());

        System.out.println("O seu Novo Salario é: "+NovoSalario);
    }
}

/**
 * public class Main {
 *
 *     public static void main(String[] args) {
 *
 *
 *
 *         Scanner sc = new Scanner(System.in);
 *
 *         System.out.printf("Digite o nome do Funcionario: ");
 *
 *
 *
 *         System.out.printf("Digite o salario do Funcionario: ");
 *
 *
 *
 *         System.out.printf("Digite o cargo do Funcionario: ");
 *
 *
 *
 *         Funcionario danyllo = new Funcionario(nome, salario, cargo);
 *
 *         double novoSalario = danyllo.aumentaSalario(20);
 *
 *         System.out.println("Novo salário é: " + novoSalario);
 *
 *     }
 */