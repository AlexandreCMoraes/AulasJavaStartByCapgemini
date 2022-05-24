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
public class Exe10 {

    public static void main(String[] args) {
        System.out.println("\nA Loja Mamão com Açúcar está vendendo seus"
                + " produtos em 05(cinco)prestações sem juros. Faça um\n"
                + "algoritmo que receba um valor de uma compra e mostre o "
                + "valor das prestações\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas que deseja pagar. "
                + "Máximo 05 parcelas: ");
        double qtdParcelas = scanner.nextDouble();

        double valorParcelas = valorCompra / qtdParcelas;

        System.out.printf("O valor das parcelas serão de: %.0fx de R$%.2f",
                qtdParcelas, valorParcelas);

    }
}
