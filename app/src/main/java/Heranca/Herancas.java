/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Date;

/**
 *
 * @author alexandre
 */
public class Herancas {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor();
        v1.setNome("Alexandre");
        v1.setSalario(1005.0f);
        v1.setCpf("33333333305");
        v1.setDataNascimento(new Date());
        v1.setComissaoPorItem(10.0f);
        v1.setTotalItensVendidos(10);
        System.out.printf("O salário do vendedor é de: R$%.2f",
                v1.calcularSalario());

        Motorista m1 = new Motorista();
        m1.setNome("Luciana");
        m1.setSalario(2005.0f);
        m1.setCpf("55555555506");
        m1.setDataNascimento(new Date());
       // System.out.printf("O salário do motorista é de: R$%.2f",m1.;

    }
}
