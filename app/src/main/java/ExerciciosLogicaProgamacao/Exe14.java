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
public class Exe14 {

    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo que leia dois valores"
                + " inteiro distintos e informe qual é o maior\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor e em seguida, o segundo valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.printf("O Primeiro valor %d é maior que o "
                    + "Segundo valor %d", valor1, valor2);
        } else {
            System.out.printf("O Segundo valor %d é maior que o "
                    + "Primeiro valor %d", valor2, valor1);
        }
    }
}
