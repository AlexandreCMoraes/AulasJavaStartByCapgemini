/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class While {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        int totalAlunos = 10;

        while (totalAlunos > 0) {
            String nomeAluno = dados.nextLine();
            int idadeAluno = dados.nextInt();

            System.out.printf("O nome do aluno é: %s e sua idade é: %d",
                    nomeAluno, idadeAluno);
            
            totalAlunos -= 1;
        }
        System.out.println(totalAlunos);
    }
}
