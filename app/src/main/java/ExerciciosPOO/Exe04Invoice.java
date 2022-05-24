/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosPOO;

/**
 *
 * @author alexandre
 */
public class Exe04Invoice {

    /*
    classe chamada Invoice deve incluir as seguintes informaçõescomo atributos:
    a.o número do item faturado,
    b.a descrição do item,
    c.a quantidade comprada do item e
    d.o preço unitário do item.
     */
    private int codigoItem;
    private String descricao;
    private int qtd;
    private float precoUnitario;

    /*
    deve ter um construtor que inicialize os quatro atributos
     */
    public Exe04Invoice(int codigoItem, String descricao, int qtd, float precoUnitario) {
        
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQtd(qtd);
        this.setPrecoUnitario(precoUnitario);

        /*
        Se a quantidade não for positiva, ela deve ser configurada como 0. 
        Se o preço por item não for positivo ele deve ser configurado como 0.0.
        Feito aqui primeiro e depois mudado para o devido lugar essas validações
         */
 /* mudado para dentro do setter setQtd
        if (qtd <= 0) {
            this.qtd = 0;
        } else {
            this.qtd = qtd;
        }
         */
 /* mudado para dentro do setter setprecoUnitario
        if (precoUnitario < 0) {
            this.precoUnitario = 0;

        } else {
            this.precoUnitario = precoUnitario;

        }
         */
    }

    /*
    método chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica 
    a quantidade pelo preço por item) e depois retorna o valor como um double
     */
    public double getInvoiceAmount() {
        return qtd * precoUnitario;
    }

    /*
    Forneça os métodos getters e setters para cada variável de instância
     */
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {

        if (qtd <= 0) {
            this.qtd = 0;
        } else {
            this.qtd = qtd;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {

        if (precoUnitario < 0) {
            this.precoUnitario = 0;

        } else {
            this.precoUnitario = precoUnitario;

        }
    }
}
