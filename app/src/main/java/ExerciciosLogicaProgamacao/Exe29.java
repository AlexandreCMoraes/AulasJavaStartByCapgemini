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
public class Exe29 {

    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que receba o número do mês e "
                + "mostre o mês correspondente. Valide mês inválido\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");


        char cont = 's';
        
        while (cont == 's' || cont == 'S') {
            
            System.out.print("");
            int numMes = scanner.nextInt();

            switch (numMes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    throw new AssertionError("mês inválido");
            }
            //afazer xfghjcxf
            System.out.println("\nDigite outro número se deseja continuar ou"
                    + " N para sair.");
            cont = scanner.next().charAt(0);
        }
    }
}
