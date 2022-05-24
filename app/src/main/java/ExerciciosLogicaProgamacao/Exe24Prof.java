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
public class Exe24Prof {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba “N” números e mostre"
                + " positivo, negativo ou zero para cada número\n");

        Scanner scanner = new Scanner(System.in);
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um numero");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O numero é 0");
            } else if (numero > 0) {
                System.out.println("O numero é  maior que 0");
            } else {
                System.out.println("Menor que 0");
            }
            System.out.println("Deseja continuar? S - sim / N - não");
            desejaContinuar = scanner.next().charAt(0);//PEGA PRIMEIRA LETRA DA PALAVRA
        }
    }
}
