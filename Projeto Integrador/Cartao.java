package projeto.integrador;

public abstract class Cartao extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String bandeira;
    private String cvv;

    public Cartao() {
        super();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    protected boolean validarCartao() {

        if (getValor() <= 0) {
            return false;
        }

        if (numeroCartao == null || numeroCartao.isEmpty()) {
            return false;
        }

        if (nomeTitular == null || nomeTitular.isEmpty()) {
            return false;
        }

        if (bandeira == null || bandeira.isEmpty()) {
            return false;
        }

        if (cvv == null || cvv.isEmpty()) {
            return false;
        }

        return true;
    }

    @Override
    public void mostrarPagamento() {
        System.out.println("---------------------------");
        System.out.println("Pagamento com Cartao");
        System.out.println("Numero do pagamento: " + getNumeroPagamento());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Numero do cartao: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Bandeira: " + bandeira);
        System.out.println("CVV: " + cvv);
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------");
    }
}