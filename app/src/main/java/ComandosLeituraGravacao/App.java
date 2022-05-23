package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner nome = new Scanner(System.in);
        System.out.print("Nome -> ");
        String n = nome.next();
        
        Scanner idade = new Scanner(System.in);
        System.out.print("Idade -> ");
        int i = idade.nextInt();
        
        System.out.printf("Seu nome é: %s e você tem %d.", n, i);
        
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
