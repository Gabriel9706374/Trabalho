package projeto.integrador;

public abstract class Pagamento {

    private static int contador = 1;

    private int numeroPagamento;
    private double valor;
    private String status;

    public Pagamento() {

        numeroPagamento = contador;
        contador++;

        status = "PENDENTE";
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void realizarPagamento() {

        if (valor > 0) {

            status = "APROVADO";

            System.out.println("Pagamento realizado com sucesso!");

        } else {

            status = "REPROVADO";

            System.out.println("O valor do pagamento deve ser maior que zero.");

        }
    }
    
    protected void aprovarPagamento() {
    status = "APROVADO";
}

    public void mostrarPagamento() {

        System.out.println("---------------------------");
        System.out.println("Numero do pagamento: " + numeroPagamento);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");

    }
}
