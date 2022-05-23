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
public class Exe35 {

    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que calcule o valor da conta de "
                + "luz de uma pessoa. Sabe-se que o cálculo da conta de\n"
                + "luz segue a tabela abaixo:\n"
                + "Tipo de Cliente Valor do KW/h\n"
                + "a. (Residência) 0,60;\n"
                + "b. (Comércio) 0,48;\n"
                + "c. (Indústria) 1,29.");

        Scanner dadosMorHora = new Scanner(System.in);
        System.out.println("\nVamos calcular o valor da sua conta de luz. "
                + "\nDigite o total de horas utilizadas: ");
        double totalHoras = dadosMorHora.nextDouble();

        //Scanner tipoMoradia = new Scanner(System.in);
        System.out.println("Agora digite o tipo de moradia:\n"
                + "1 - Residência\n"
                + "2 - Comércio\n"
                + "3 - Indústria\n"
                + "4 - Sair");
        int escolha = dadosMorHora.nextInt();
        System.out.print("Sua escolha foi -> " + escolha + "\n");

        double residencia = totalHoras * 0.60;
        double comercio = totalHoras * 0.48;
        double industria = totalHoras * 1.29;

        switch (escolha) {
            case 1:
                System.out.printf("Sua conta será de R$%.2f", residencia);
                break;
            case 2:
                System.out.printf("Sua conta será de R$%.2f", comercio);
                break;
            case 3:
                System.out.printf("Sua conta será de R$%.2f",
                        industria);
                break;
            case 4:
                System.out.printf("Saindo do programa ...");
                break;
            default:
                throw new AssertionError();
        }
    }
}
