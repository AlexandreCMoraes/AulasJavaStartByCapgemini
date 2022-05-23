/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Exe04 {

    public static void main(String[] args) {
        System.out.println("\nEscreva um algoritmo que leia o nome de um "
                + "vendedor, o seu salário fixo e o total de vendas efetuadas\n"
                + "por ele no mês (em dinheiro). Sabendo que este vendedor "
                + "ganha 15% de comissão"
                + " sobre suas vendas\n"
                + "efetuadas, informar o seu nome, o salário fixo e salário no "
                + "final do mês\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome, vendedor: ");
        String nomeV = scanner.next();
        System.out.println("Digite o total de vendas feitas em dinheiro: ");
        double totalVendas = scanner.nextDouble();
        System.out.println("Digite seu salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        double salarioFim = salarioFixo + (totalVendas * 0.15);

        System.out.printf("%s recebe: R$%.2f por mês e seu salario final com "
                + "comissão de 15%%"
                + " sobre as vendas foi de: R$%.2f", nomeV, salarioFixo,
                salarioFim);
    }
}
