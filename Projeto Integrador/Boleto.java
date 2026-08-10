package projeto.integrador;

public class Boleto extends Pagamento {

    private String codigoBarras;

    public Boleto() {
        super();
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() > 0 && codigoBarras != null && !codigoBarras.isEmpty()) {

            aprovarPagamento();

            System.out.println("Pagamento por boleto realizado com sucesso!");

        } else {

            System.out.println("Pagamento por boleto invalido!");

        }
    }

    @Override
    public void mostrarPagamento() {
        System.out.println("---------------------------");
        System.out.println("Pagamento por Boleto");
        System.out.println("Numero do pagamento: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Codigo de barras: " + codigoBarras);
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");
    }
}