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
public class Exe16 {

    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo que leia o nome e as três "
                + "notas obtidas por um aluno durante o semestre. Calcular a\n"
                + "sua média (aritmética), informar o nome e sua menção "
                + "aprovado (media >= 7), Reprovado (media <= 5) e\n"
                + "Recuperação (media entre 5.1 a 6.9)\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Digite as três notas.\n"
                + "1° nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("2° nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("3° nota: ");
        double nota3 = scanner.nextDouble();
        double totalNotas = nota1 + nota2 + nota3;
        double mediaAluno = totalNotas / 3;

        if (mediaAluno >= 7) {
            System.out.printf("O aluno %s com nota %.1f, está APROVADO",
                    nomeAluno, totalNotas);
        } else if (mediaAluno <= 5) {
            System.out.printf("O aluno %s com nota %.1f está REPROVADO",
                    nomeAluno, totalNotas);
        } else {
            System.out.printf("O aluno %s com nota %.1f está em RECUPERAÇÃO",
                    nomeAluno, totalNotas);
        }
    }
}
