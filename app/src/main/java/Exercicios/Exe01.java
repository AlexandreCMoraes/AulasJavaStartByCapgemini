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
public class Exe01 {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba dois números e exiba o "
                + "resultado da sua soma\n");

        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero01 = numeros.nextInt();

        //Scanner num02 = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        int numero02 = numeros.nextInt();

        int soma = numero01 + numero02;

        System.out.printf("A soma de %d + %d = %d", numero01, numero02, soma);
    }
}
