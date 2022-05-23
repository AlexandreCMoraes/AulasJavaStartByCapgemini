/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConceitoClasse;

/**
 *
 * @author alexandre
 */
public class Pessoa {

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        
        System.out.println("Método constructor rodando");
    }

    //ATRIBUTOS DA CLASSE PESSOA
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private double altura;
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;

    }
}
