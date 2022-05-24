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
public class Exe12 {

    public static void main(String[] args) {
        System.out.println("O custo de um carro novo ao consumidoré a soma do "
                + "custo de fábrica mais o percentual do distribuidor e\n"
                + "dos impostos aplicados (primeiro os impostos são aplicados "
                + "sobre o custo de fábrica, e depois o percentual\n"
                + "do distribuidor sobre o resultado). Supondo que o percentual "
                + "do distribuidor seja de 28% e os impostos\n"
                + "45%, escreva um algoritmo que leia o custo de fábrica de um "
                + "carro e informe o custo ao consumidor do\n"
                + "mesmo\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do veículo: R$");
        float custoFab = scanner.nextFloat();
        
        float percentualImposto = (100 / 45) + custoFab;
        float percentualFabrica = (100 / 28) + percentualImposto;
        
        //float calculoVenda = (percentualImposto + custoFab) + percentualFabrica;
        
        System.out.printf("Valor do imposto sobre veículo (+ 45%%): R$%.2f\n", 
                percentualImposto);     
        System.out.printf("Custo do veículo ao consumidor com valor do imposto + "
                + "percentual de fábrica (28%%) é de : R$%.2f",
                percentualFabrica);
    }

}
