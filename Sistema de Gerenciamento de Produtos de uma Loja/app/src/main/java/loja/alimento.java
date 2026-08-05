package loja;

public class alimento extends produto {
    private String validade;

    public alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    public void verificarValidade() {
        System.out.println("Validade do alimento: " + validade);
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Validade: " + validade);
    }
}