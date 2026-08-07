package loja;

public class smartphone extends eletronico {

    private String marca;
    private double tamanho_tela;

    public smartphone(String nome, double preco, int estoque, int garantia,
            fornecedor fornecedor, String marca, double tamanho_tela) {

        super(nome, preco, estoque, garantia, fornecedor);

        this.marca = marca;
        this.tamanho_tela = tamanho_tela;
    }

    @Override
    public void apresentar() {

        super.apresentar();

        System.out.println("Marca: " + marca);
        System.out.println("Tamanho da tela: " + tamanho_tela + " polegadas");
    }
}