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
public class Exe02 {

    public static void main(String[] args) {
        System.out.println("\nFaça um algoritmo que receba dois números e ao "
                + "final mostre a soma, subtração, multiplicação e a divisão\n"
                + "dos dois números lidos\n");

        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = numeros.nextInt();

        //Scanner n2 = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        int num2 = numeros.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.printf("A soma de %d + %d = %d", num1, num2, soma);
        System.out.printf("\nA subtração de %d - %d = %d", num1, num2, sub);
        System.out.printf("\nA multiplicação de %d * %d = %d", num1, num2, mult);
        System.out.printf("\nA divisão de %d / %d = %d", num1, num2, div);

    }

}
