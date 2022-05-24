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
public class Exe20Prof {

    public static void main(String[] args) {
        System.out.println("A concessionária de veículos “CARANGO VELHO” "
                + "está vendendo os seus veículos com desconto. Faça\n"
                + "um algoritmo que calcule e exiba o valor do desconto e o "
                + "valor a ser pago pelo cliente de vários carros. O\n"
                + "desconto deverá ser calculado de acordo com o ano do "
                + "veículo. Até 2000 - 12% e acima de 2000 - 7%. O\n"
                + "sistema deverá perguntar se deseja continuar calculando "
                + "o desconto até que a resposta seja: “(N) Não”.\n"
                + "Informar total de carros com ano até 2000 e total geral;\n");

        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;

        //boolean desejaRepetir = true;
        char desejaRepetir = 's';

        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        Scanner scanner = new Scanner(System.in);

        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.print("Digite o ano de fabricação do veículo: ");
            anoFabricacao = scanner.nextInt();
            System.out.print("Digite o valor do veículo: ");
            valorVeiculo = scanner.nextFloat();

            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;

            System.out.println("O valor de desconto foi de: R$" + valorDesconto);
            System.out.println("O valor que deve ser pago é: R$" + valorPagar);

            System.out.println("Deseja fazer mais cadastros?\n"
                    + "S - sim \n"
                    + "N - não");
            desejaRepetir = scanner.next().charAt(0);
        }

        System.out.println("Total de carros semi-novos: " + totalCarrosSemiNovos);
        System.out.print("Total de carros: " + totalCarros);
    }
}
