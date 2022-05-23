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
public class Exe09 {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba um valor que foi "
                + "depositado e exiba o valor com rendimento após um\n"
                + "mês. Considere fixo o juro da poupança em 0,07% a. m;\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado e saiba quanto rende"
                + " em um mês: ");
        double valorDep = scanner.nextDouble();
        
        double jurosFixo = valorDep * 0.07d;
        
        System.out.printf("O valor rendeu: R$%.2f", jurosFixo); 

    }

}
