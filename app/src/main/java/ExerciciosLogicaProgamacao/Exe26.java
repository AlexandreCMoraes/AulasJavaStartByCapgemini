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
public class Exe26 {

    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que leia um número de 1 a 5 e"
                + " escreva por extenso. Caso o usuário digite um número\n"
                + "que não esteja neste intervalo, exibir a "
                + "seguinte mensagem: número inválido\n");

        Scanner scanner = new Scanner(System.in);
        char cont = 's';

        while (cont == 's' || cont == 'S') {

            System.out.print("Digite um número de 1 até 5: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Número Um");
                    break;
                case 2:
                    System.out.println("Número Dois");
                    break;
                case 3:
                    System.out.println("Número Três");
                    break;
                case 4:
                    System.out.println("Número Quatro");
                    break;
                case 5:
                    System.out.println("Número Cinco");
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("\nContinuar a digitar?\n"
                    + "S - sim\n"
                    + "N - não");
            cont = scanner.next().charAt(0);
        }
        System.out.println("Encerrando programa ...");
    }
}
