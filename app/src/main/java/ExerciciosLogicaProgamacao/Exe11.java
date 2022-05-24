/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosLogicaProgamacao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Exe11 {

    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que receba o preço de custo de"
                + " um produto e mostre o valor de venda. Sabe-se que o\n"
                + "preço de custo receberá um acréscimo de acordo com um "
                + "percentual informado pelo usuário\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();
        
        System.out.print("Digite o percentual de acréscimo para venda: ");
        double percentual = 100 / scanner.nextDouble();
        
        double valorVenda = precoCusto + percentual ;
        
        System.out.printf("O valor da venda é de : R$%.2f", valorVenda);

    }

}
