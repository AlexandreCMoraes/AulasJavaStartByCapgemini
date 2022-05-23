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
public class Exe05 {

    public static void main(String[] args) {
        System.out.println("\nEscreva um algoritmo que leia o nome de um aluno"
                + " e as notas das três provas que ele obteve no semestre.\n"
                + "No final, informar o nome do aluno e a sua média (aritmética)\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(nomeAluno + " tem média de : " + media);

    }

}
