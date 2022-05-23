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
public class Exe06 {

    public static void main(String[] args) {
        System.out.println("\nLeia dois valores para as variáveis A e B, e "
                + "efetuar as trocas dos valores de forma que a variávelA"
                + " passe a\n"
                + "possuir o valor da variável B e a variável B passe a possuir"
                + " o valor da variável A. Apresentar osvalores\n"
                + "trocados\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da varA: ");
        int varA = scanner.nextInt();
        System.out.println("Digite o valor da varB: ");
        int varB = scanner.nextInt();
        System.out.printf("Os valores foram:\n"
                + "varA = %d\n"
                + "varB = %d \n", varA, varB);

        int varAT = varB;
        int varBt = varA;
        System.out.printf("Agora com os valores invertidos:\n"
                + "varA = %d\n"
                + "varB = %d", varAT, varBt);
    }
}
