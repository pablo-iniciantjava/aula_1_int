package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("------------Olá Aluno SENAI-SUMARÉ--------------\n");
        System.out.printf("\nAtividade Verificador de número primo em Java!\n");

        System.out.println("Por favor Dgite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor Dgite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Bem Vindo Aluno\n" + nome + " " + cpf);
        System.out.println("-------------------------------------");

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite 1 ou 2: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}