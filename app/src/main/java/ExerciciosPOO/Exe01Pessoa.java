/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPOO;

/**
 *
 * @author alexandre
 */

/*
Crie uma classe para representar uma Pessoa com os atributos privados de nome, 
data de nascimento e altura. Crie os métodos públicos necessários para getters
e setters e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular a idade da pessoa.
 */
public class Exe01Pessoa {

    private String nome;
    private float dataNascimento;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(float dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
