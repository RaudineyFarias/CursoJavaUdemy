package Exercicio_Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario F1 = new Funcionario();

        System.out.println("Digite O Nome do Funcionário: ");
        F1.setNome(sc.next());

        System.out.println("Digite O cargo do Funcionário: ");
        F1.setCargo(sc.next());

        System.out.println("Digite O Salário do Funcionário: ");
        F1.setSalario(sc.nextDouble());

        F1.aumentarsalario(15.00);

        System.out.println("O salario depois do aumento: "+F1.salario());

    }
}
