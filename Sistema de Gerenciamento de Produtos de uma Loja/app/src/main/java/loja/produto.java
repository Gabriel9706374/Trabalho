package loja;

public class produto {
    protected String nome;
    protected double preco;
    protected int estoque;
    
    public produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void reporEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println("Estoque atualizado com sucesso!");
    }

    public void apresentar() {
        System.out.println("\n=== Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
    }
}