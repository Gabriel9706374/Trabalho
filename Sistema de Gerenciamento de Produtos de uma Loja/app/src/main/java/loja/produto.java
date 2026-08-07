package loja;

public class produto {
    protected String nome;
    protected double preco;
    protected int estoque;
    protected fornecedor fornecedor;

    public produto(String nome, double preco, int estoque, fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    public void vender(double valor_pagamento) {

        if (valor_pagamento >= preco) {

            if (estoque > 0) {
                estoque--;
                System.out.println("Venda realizada com sucesso!");
                System.out.println("Troco: R$ " + (valor_pagamento - preco));
            } else {
                System.out.println("Estoque insuficiente!");
            }

        } else {
            System.out.println("Valor de pagamento insuficiente!");
        }
    }

    public void vender(double valor_pagamento, double desconto) {

        double valor_final = preco - (preco * desconto / 100);

        if (valor_pagamento >= valor_final) {

            if (estoque > 0) {
                estoque--;
                System.out.println("Venda realizada com sucesso!");
                System.out.println("Valor com desconto: R$ " + valor_final);
                System.out.println("Troco: R$ " + (valor_pagamento - valor_final));
            } else {
                System.out.println("Estoque insuficiente!");
            }

        } else {
            System.out.println("Valor de pagamento insuficiente!");
        }
    }

    public void reporEstoque(int quantidade) {

        estoque += quantidade;

        System.out.println("Estoque atualizado com sucesso!");
    }

    public void apresentar() {

        System.out.println("\n=== Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estoque: " + estoque);

        fornecedor.apresentar();
    }
}