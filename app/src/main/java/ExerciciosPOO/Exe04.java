/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPOO;

/**
 *
 * @author alexandre
 */
public class Exe04 {

    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada Invoice que possa "
                + "ser utilizado por uma loja de suprimentos de informática para\n"
                + "representar uma fatura de um item vendido na loja. "
                + "Uma fatura deve incluir as seguintes informações\n"
                + "como atributos:\n"
                + "a. o número do item faturado,\n"
                + "b. a descrição do item,\n"
                + "c. a quantidade comprada do item e\n"
                + "d. o preço unitário do item.\n"
                + "Sua classe deve ter um construtor"
                + " que inicialize os quatro atributos. Se a quantidade não"
                + " for positiva, ela\n"
                + "deve ser configurada como 0. Se o preço por item não for "
                + "positivo ele deve ser configurado como 0.0.\n"
                + "Forneça os métodos getters e setters para cada variável "
                + "de instância. Além disso, forneça um método\n"
                + "chamado getInvoiceAmount que calcula o valor da fatura"
                + " (isso é, multiplica a quantidade pelo preço por\n"
                + "item) e depois retorna o valor como um double. "
                + "Escreva um aplicativo de teste que demonstra as\n"
                + "capacidades da classe Invoice.\n");

        Exe04Invoice inv = new Exe04Invoice(1, "MousePad", -10, 50.0f);
        
        System.out.println("O valor total: " + inv.getInvoiceAmount());
    }

}
