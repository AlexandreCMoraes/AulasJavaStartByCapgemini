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
public class Exe33 {

    public static void main(String[] args) {
        System.out.println("A escola “APRENDER” faz o pagamento de seus professores "
                + "por hora/aula. Faça um algoritmo que\n"
                + "calcule e exiba o salário de um professor. Sabe-se que o "
                + "valor da hora/aula segue a tabela abaixo:\n"
                + "a. Professor Nível 1 R$12,00 por hora/aula;\n"
                + "b. Professor Nível 2 R$17,00 por hora/aula;\n"
                + "c. Professor Nível 3 R$25,00 por hora/aula.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos dias trabalhados: ");
        int diasTrabalhado = scanner.nextInt();
        
        System.out.print("Digite quantas horas por dia trabalhados: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        double totalHorasTrab = horasTrabalhadas * diasTrabalhado;
        System.out.print("Escolha as opções de acordo com seu nível:\n"
                + "1 - Professor Nível 1 R$12,00 por hora/aula;\n"
                + "2 - Professor Nível 2 R$17,00 por hora/aula;\n"
                + "3 - Professor Nível 3 R$25,00 por hora/aula.\n");
        int opcaoNivel = scanner.nextInt();

        double nivel1 = totalHorasTrab * 12.00d;
        double nivel2 = totalHorasTrab * 17.00d;
        double nivel3 = totalHorasTrab * 25.00d;

        switch (opcaoNivel) {
            case 1:
                System.out.printf("Seu salario foi de R$%.2f", nivel1);
                break;
            case 2:
                System.out.printf("Seu salario foi de R$%.2f", nivel2);
                break;
            case 3:
                System.out.printf("Seu salario este mês foi de R$%.2f", nivel3);
                break;
            default:
                throw new AssertionError();
        }
    }
}
