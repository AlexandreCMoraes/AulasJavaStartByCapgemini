/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConceitoClasse;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Main {

    public static void main(String[] args) {
        //DECLARANDO PESSOA P/ ACECSSAR CLASSE
        Pessoa p1 = new Pessoa(78, 1.72);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite seu peso: ");
        p1.setPeso(scanner.nextDouble());
        System.out.print("Digite sua altura: ");
        p1.setAltura(scanner.nextDouble());
                
        System.out.printf("Seu IMC é: %.2f", p1.calcularIMC());
    }
}
