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
public class Exe22Prof {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba o preço de custo e o "
                + "preço de venda de 40 produtos. Mostre como resultado\n"
                + "se houve lucro, prejuízo ou empate para cada produto. "
                + "Informe o valor de "
                + "custo de cada produto, o valor\n"
                + "de venda de cada produto, a média de preço de custo e do "
                + "preço de venda\n");

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float mediaTotalCusto = 0.0f;
        float mediaTotalVenda = 0.0f;

        Scanner scanner = new Scanner(System.in);

        int i = 0;// VAR AGORA VALE PARA TODO METODO MAIN P/ USA-LA EM TODO
        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scanner.next();

            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = scanner.nextFloat();

            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = scanner.nextFloat();

            mediaTotalCusto += precoCusto;
            mediaTotalVenda += precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre preço de custo e venda ");
            } else if (precoCusto > precoVenda) {
                System.out.println("Houve prejuizo ai hein !");
            } else {
                System.out.println("Houve lucro, mané");
            }
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto
                    + ", preço de venda = " + precoVenda);
        }
        System.out.println("A média do preço de custo é de: " + (mediaTotalCusto / i));
        System.out.println("A média do preço de venda é de: " + (mediaTotalVenda / i));
    }
}
