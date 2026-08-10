package projeto.integrador;

public class Pix extends Pagamento {

    private String chavePix;

    public Pix() {
        super();
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento() {

        if (getValor() > 0 && chavePix != null && !chavePix.isEmpty()) {

            System.out.println("Pagamento por PIX realizado com sucesso!");

        } else {

            System.out.println("Pagamento PIX invalido!");

        }
    }

    @Override
    public void mostrarPagamento() {
         System.out.println("---------------------------");
        System.out.println("Pagamento PIX");
        System.out.println("Numero do pagamento: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Chave PIX: " + chavePix);
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");

    }
}