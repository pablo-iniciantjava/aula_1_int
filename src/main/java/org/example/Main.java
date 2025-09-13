package org.example;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("------------Olá Aluno SENAI-SUMARÉ--------------\n");
        System.out.printf("\nAtividade Verificador de número primo em Java!\n");

        System.out.println("Por favor Dgite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor Dgite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Bem Vindo Aluno\n" + nome + " " + cpf);
        System.out.println("-------------------------------------");


        System.out.println("Mas o que são numeros Primos? Segue abaixo exemplo simples: ");
        System.out.println("úmeros primos são inteiros maiores que 1, divisíveis apenas por 1 e por eles mesmos.");
        System.out.println("-------------------------------------");
        System.out.print("Para iniciar, por favor, digite um número: ");

        while (true) {
            // Lê o número
            int n = scanner.nextInt();

            // Inicializa a variável primo
            boolean primo = true;

            // Verifica se é primo
            if (n <= 1) {
                primo = false;
            } else {
                // Verifica se algum número de 2 até n/2 divide n
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        primo = false;
                        break; // já encontrou um divisor
                    }
                }
            }


            // Mostra o resultado
            if (primo) {
                System.out.println(n + " é primo!");
            } else {
                System.out.println(n + " não é primo.");
            }

            System.out.println("Quer tentar outro numero: ");
        }
    }
}