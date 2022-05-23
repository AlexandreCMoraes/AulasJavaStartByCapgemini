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
public class Exe07 {

    public static void main(String[] args) {
        System.out.println("\nLeia uma temperatura em graus Celsius e "
                + "apresentá-la convertida em graus Fahrenheit. A fórmula de\n"
                + "conversão é: F=(9*C+160) / 5, sendo F a temperatura em "
                + "Fahrenheit e C a"
                + "temperatura em Celsius\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double calculoFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("A temperatura em graus Fahrenheit é de: %.2f graus.", calculoFahrenheit);

    }

}
