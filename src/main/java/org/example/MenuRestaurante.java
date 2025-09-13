package org.example;

import javax.swing.*;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\nOlá! Seja bem-vindo à Lanchonete Restaurante SENAI Sumaré");
        System.out.println("=========================================================\n");

        System.out.println("==================== MENU LANCHONETE =====================");


        int categoria, item;

        // Arrays para armazenar itens, preços e quantidades
        String[] pedidos = new String[100];
        double[] precos = new double[100];
        int[] quantidades = new int[100];
        int contadorPedidos = 0;

        while (true) {
            // Menu principal
            System.out.println("1 - Salgados");
            System.out.println("2 - Bebidas");
            System.out.println("3 - Lanches");
            System.out.println("4 - Almoço");
            System.out.println("5 - Fechar pedido");
            System.out.println("0 - Sair");
            System.out.println("\nEscolha a categoria:");
            categoria = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            if (categoria == 0) {
                System.out.println("Programa encerrado!");
                break;
            }

            if (categoria == 5) { // Fechar pedido e ENCERRAR
                double total = 0;
                if (contadorPedidos == 0) {
                    System.out.println("\nNenhum item selecionado.");
                } else {
                    System.out.println("\nItens selecionados:");
                    for (int i = 0; i < contadorPedidos; i++) {
                        double subtotal = precos[i] * quantidades[i];
                        System.out.println(" - " + pedidos[i] + " x" + quantidades[i] + " ($" + subtotal + ")");
                        total += subtotal;
                    }
                    System.out.printf("Total a pagar: $%.2f\n", total);
                }
                break; // <-- encerra o programa após fechar pedido
            }

            // Loop para permitir selecionar vários itens na mesma categoria
            boolean continuarCategoria = true;
            while (continuarCategoria) {

                if (categoria == 1) { // Salgados
                    System.out.println("\nSalgados:");
                    System.out.println("1 - Coxinha ($3.50)");
                    System.out.println("2 - Kibe ($4.00)");
                    System.out.println("3 - Esfiha ($3.00)");
                    System.out.println("4 - Pastel ($3.50)");
                    System.out.print("Escolha um item: ");
                    item = scanner.nextInt();
                    scanner.nextLine();

                    String nomeItem = "";
                    double precoItem = 0;

                    if (item == 1) {
                        nomeItem = "Coxinha";
                        precoItem = 3.50;
                    } else if (item == 2) {
                        nomeItem = "Kibe";
                        precoItem = 4.00;
                    } else if (item == 3) {
                        nomeItem = "Esfiha";
                        precoItem = 3.00;
                    } else if (item == 4) {
                        nomeItem = "Pastel";
                        precoItem = 3.50;
                    } else {
                        System.out.println("Item inválido!");
                        continue;
                    }

                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    pedidos[contadorPedidos] = nomeItem;
                    precos[contadorPedidos] = precoItem;
                    quantidades[contadorPedidos] = qtd;
                    contadorPedidos++;

                } else if (categoria == 2) { // Bebidas
                    System.out.println("\nBebidas:");
                    System.out.println("1 - Água ($2.00)");
                    System.out.println("2 - Refrigerante ($3.00)");
                    System.out.println("3 - Suco ($3.50)");
                    System.out.println("4 - Cerveja ($5.00)");
                    System.out.println("5 - Vinho ($12.00)");
                    System.out.print("Escolha um item: ");
                    item = scanner.nextInt();
                    scanner.nextLine();

                    String nomeItem = "";
                    double precoItem = 0;

                    if (item == 1) {
                        nomeItem = "Água";
                        precoItem = 2.00;
                    } else if (item == 2) {
                        nomeItem = "Refrigerante";
                        precoItem = 3.00;
                    } else if (item == 3) {
                        nomeItem = "Suco";
                        precoItem = 3.50;
                    } else if (item == 4) {
                        nomeItem = "Cerveja";
                        precoItem = 5.00;
                    } else if (item == 5) {
                        nomeItem = "Vinho";
                        precoItem = 12.00;
                    } else {
                        System.out.println("Item inválido!");
                        continue;
                    }

                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    pedidos[contadorPedidos] = nomeItem;
                    precos[contadorPedidos] = precoItem;
                    quantidades[contadorPedidos] = qtd;
                    contadorPedidos++;

                } else if (categoria == 3) { // Lanches
                    System.out.println("\nLanches:");
                    System.out.println("1 - Sanduíche ($6.00)");
                    System.out.println("2 - Hot Dog ($5.50)");
                    System.out.println("3 - Croissant ($4.50)");
                    System.out.println("4 - Hambúrguer ($7.00)");
                    System.out.print("Escolha um item: ");
                    item = scanner.nextInt();
                    scanner.nextLine();

                    String nomeItem = "";
                    double precoItem = 0;

                    if (item == 1) {
                        nomeItem = "Sanduíche";
                        precoItem = 6.00;
                    } else if (item == 2) {
                        nomeItem = "Hot Dog";
                        precoItem = 5.50;
                    } else if (item == 3) {
                        nomeItem = "Croissant";
                        precoItem = 4.50;
                    } else if (item == 4) {
                        nomeItem = "Hambúrguer";
                        precoItem = 7.00;
                    } else {
                        System.out.println("Item inválido!");
                        continue;
                    }

                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    pedidos[contadorPedidos] = nomeItem;
                    precos[contadorPedidos] = precoItem;
                    quantidades[contadorPedidos] = qtd;
                    contadorPedidos++;

                } else if (categoria == 4) { // Almoço
                    System.out.println("\nAlmoço:");
                    System.out.println("1 - Arroz, feijão e carne ($10.00)");
                    System.out.println("2 - Lasanha ($12.00)");
                    System.out.println("3 - Macarrão ao molho ($11.00)");
                    System.out.println("4 - Salada ($8.00)");
                    System.out.print("Escolha um item: ");
                    item = scanner.nextInt();
                    scanner.nextLine();

                    String nomeItem = "";
                    double precoItem = 0;

                    if (item == 1) {
                        nomeItem = "Arroz, feijão e carne";
                        precoItem = 10.00;
                    } else if (item == 2) {
                        nomeItem = "Lasanha";
                        precoItem = 12.00;
                    } else if (item == 3) {
                        nomeItem = "Macarrão ao molho";
                        precoItem = 11.00;
                    } else if (item == 4) {
                        nomeItem = "Salada";
                        precoItem = 8.00;
                    } else {
                        System.out.println("Item inválido!");
                        continue;
                    }

                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    pedidos[contadorPedidos] = nomeItem;
                    precos[contadorPedidos] = precoItem;
                    quantidades[contadorPedidos] = qtd;
                    contadorPedidos++;
                }

                // Pergunta se deseja continuar na mesma categoria
                System.out.print("Deseja selecionar outro item nesta categoria? (sim/não): ");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("sim")) {
                    continuarCategoria = false; // volta ao menu principal
                }
            }
        }

        scanner.close();
    }
}
