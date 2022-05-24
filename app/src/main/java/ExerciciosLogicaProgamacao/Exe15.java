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
public class Exe15 {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba um número e diga "
                + "se este número está no intervalo entre 100 e 200\n");

        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = numeros.nextInt();;

        if (num >= 100 && num <= 200) {
            System.out.println("Está dentro da faixa de 100 até 200");
        } else {
            System.out.println("Não está entre a faixa");
        }
    }
}
