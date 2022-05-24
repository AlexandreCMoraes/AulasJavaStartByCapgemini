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
public class Exe08 {

    public static void main(String[] args) {
        System.out.println("\nElabore um algoritmo que efetue a apresentação "
                + "do valor da conversão em real (R$) de um valor lido em\n"
                + "dólar (US$). O algoritmo deverá solicitar o valor da cotação"
                + " do dólar e também aquantidade de dólares\n"
                + "disponíveis com o usuário\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de dólares (US$): ");
        double qtdDolar = scanner.nextDouble();
        System.out.println("Digite a cotação do dólar (US$): ");
        double cotacaoDolar = scanner.nextDouble();
        
        double conversaoReal = qtdDolar / cotacaoDolar;
        
        System.out.printf("O valor convertido para Reais é de: %.2f", conversaoReal);
    }

}
