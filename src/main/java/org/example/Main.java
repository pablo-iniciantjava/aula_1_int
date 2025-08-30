package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
    }
}
