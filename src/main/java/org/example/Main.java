package org.example;
<<<<<<< HEAD
=======
import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;
>>>>>>> b272432 (Caculadora JAVA SENAI SUMARE)

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        System.out.println("\nAtividade: Desafio do Contador. SENAI Sumare - 30/08/2025\n");
        System.out.println("Estrutura: \n\nCrie um programa que conte de 1 a 100, mas, com as seguintes condições:");

        System.out.println("Para múltiplos de 3, imprima \"Fizz\" em vez do número\n" +
                "Para múltiplos de 5, imprima \"Buzz\" em vez do número\n" +
                "Para múltiplos de 3 e 5, imprima \"FizzBuzz\"\n" +
                "Tempo para resolver: 15 minutos. Depois discutiremos as soluções em grupo.");
        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;

        }
=======
        Scanner sc = new Scanner(System.in);

        //Estrutura validação usuario aluno.

        System.out.print("Aluno, por favor digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.print("Aluno, por favor digite seu nome e CPF: ");
        String cpf = sc.nextLine();

        System.out.println("\nNome: " + nome + " CPF: " + cpf );
        System.out.println("\nSeja bem-vindo!");
        System.out.print("\nAluno com Acesso Permitido Calculadora SENAI SUMARÉ-SP");

        //Calculadora inicio.



        System.out.println("\nDigite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = sc.nextInt();

        double resultado;
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        sc.close();
>>>>>>> b272432 (Caculadora JAVA SENAI SUMARE)
    }
}
