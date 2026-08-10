package projeto.integrador;

public class Credito extends Cartao {

    private double limiteDisponivel;
    private int quantidadeParcelas;

    public Credito() {
        super();
        quantidadeParcelas = 1;
    }

    public Credito(int quantidadeParcelas) {
        super();
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public void realizarPagamento() {

        if (!validarCartao()) {
            System.out.println("Dados do cartao invalidos!");
            return;
        }

        if (quantidadeParcelas <= 0) {
            System.out.println("Quantidade de parcelas invalida!");
            return;
        }

        if (limiteDisponivel < getValor()) {
            System.out.println("Limite insuficiente para realizar o pagamento!");
            return;
        }

        limiteDisponivel -= getValor();

        aprovarPagamento();

        System.out.println("Pagamento com cartao de credito realizado com sucesso!");

        System.out.println("Valor total: R$ " + getValor());
        System.out.println("Quantidade de parcelas: " + quantidadeParcelas);

        double valorParcela = getValor() / quantidadeParcelas;

        System.out.println("Valor de cada parcela: R$ " + valorParcela);
    }

    @Override
    public void mostrarPagamento() {
        System.out.println("---------------------------");
        System.out.println("Pagamento com Cartao de Credito");
        System.out.println("Numero do pagamento: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Numero do cartao: " + getNumeroCartao());
        System.out.println("Nome do titular: " + getNomeTitular());
        System.out.println("Bandeira: " + getBandeira());
        System.out.println("CVV: " + getCvv());
        System.out.println("Limite disponivel: R$ " + limiteDisponivel);
        System.out.println("Quantidade de parcelas: " + quantidadeParcelas);
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");
    }
}