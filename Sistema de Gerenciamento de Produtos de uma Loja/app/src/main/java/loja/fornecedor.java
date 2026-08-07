package loja;

public class fornecedor {

    private String nome;
    private String telefone;
    private String cnpj;

    public fornecedor(String nome, String telefone, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    public void apresentar() {
        System.out.println("\n=== Fornecedor ===");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
    }
}