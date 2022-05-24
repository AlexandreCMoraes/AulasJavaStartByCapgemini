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
public class Exe03 {

    public static void main(String[] args) {
        System.out.println("\nEscreva um algoritmo para determinar o consumo "
                + "médio de um automóvel sendo fornecida a distância\n"
                + "total percorrida pelo automóvel e o total de "
                + "combustível gasto\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida pelo automóvel: ");
        double km = scanner.nextDouble();
        System.out.println("Digite a quantidade de combustível gasto: ");
        double gas = scanner.nextDouble();

        double consumoMedio = km / gas;

        System.out.printf("O consumo médio do automóvel foi de: Km %.2f",
                consumoMedio);
    }
}
