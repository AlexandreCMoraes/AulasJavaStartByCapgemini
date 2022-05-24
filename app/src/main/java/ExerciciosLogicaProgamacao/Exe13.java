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
public class Exe13 {

    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que receba um número e mostre "
                + "uma mensagem caso este número seja maior que 10\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 20, e veja uma mensagem"
                + "\nNúmero -> ");
        int numero = scanner.nextInt();

        if (numero <= 5) {
            System.out.println("Primeira mensagem: Não é a linguagem de "
                    + "programação que define o programador, mas sim sua lógica.");
        } else if (numero <= 10) {
            System.out.println("Segunda mensagem: Difícil encontrar uma "
                    + "programação que me agrade, sozinho nessa grade.");
        } else {
            System.out.println("Terceira mensagem: Minhas limitações são apenas erros "
                    + "de programação prestes a serem corrigidos.");
        }
    }
}
