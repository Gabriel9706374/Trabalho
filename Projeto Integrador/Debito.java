package projeto.integrador;

public class Debito extends Cartao {

    private double saldoDisponivel;
    private String senha;

    public Debito() {
        super();
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void realizarPagamento() {

        if (!validarCartao()) {
            System.out.println("Dados do cartao invalidos!");
            return;
        }

        if (senha == null || senha.isEmpty()) {
            System.out.println("A senha do cartao deve ser informada!");
            return;
        }

        if (saldoDisponivel < getValor()) {
            System.out.println("Saldo insuficiente para realizar o pagamento!");
            return;
        }

        saldoDisponivel -= getValor();

        aprovarPagamento();

        System.out.println("Pagamento com cartao de debito realizado com sucesso!");
    }

    @Override
    public void mostrarPagamento() {
        System.out.println("---------------------------");
        System.out.println("Pagamento com Cartao de Debito");
        System.out.println("Numero do pagamento: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Numero do cartao: " + getNumeroCartao());
        System.out.println("Nome do titular: " + getNomeTitular());
        System.out.println("Bandeira: " + getBandeira());
        System.out.println("CVV: " + getCvv());
        System.out.println("Saldo disponivel: R$ " + saldoDisponivel);
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");
    }
}