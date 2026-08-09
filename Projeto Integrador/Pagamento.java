package projeto.integrador;

public class Pagamento {

    private static int contador = 1;
    private int numeroPagamento;
    private double valorVenda;
    private String modalidadePagamento;
    private String status;

    public Pagamento() {
        numeroPagamento = contador;
        contador++;
        status = "PENDENTE";
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getModalidadePagamento() {
        return modalidadePagamento;
    }

    public void setModalidadePagamento(String modalidadePagamento) {
        this.modalidadePagamento = modalidadePagamento;
    }

    public String getStatus() {
        return status;
    }

    public void realizarPagamento() {
        if (valorVenda > 0 && modalidadePagamento != null && !modalidadePagamento.isEmpty()) {
            status = "APROVADO";
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            status = "REPROVADO";
            System.out.println("Pagamento invalido!");
        }
    }

    public void mostrarPagamento() {
        System.out.println("---------------------------");
        System.out.println("Numero: " + numeroPagamento);
        System.out.println("Valor da Venda: R$ " + valorVenda);
        System.out.println("Modalidade: " + modalidadePagamento);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}
