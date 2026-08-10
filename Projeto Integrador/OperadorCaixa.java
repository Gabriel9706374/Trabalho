package projeto.integrador;

public class OperadorCaixa extends Funcionario {

    private static int contadorCaixa = 1;

    private int numeroCaixa;
    private String status;

    public OperadorCaixa() {

        super();

        numeroCaixa = contadorCaixa;
        contadorCaixa++;

        status = "FECHADO";

        setCargo("Operador de Caixa");

    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void abrirCaixa() {

        status = "ABERTO";

        System.out.println("Caixa aberto com sucesso!");

    }

    public void fecharCaixa() {

        status = "FECHADO";

        System.out.println("Caixa fechado com sucesso!");

    }

    @Override
    public void mostrarDados() {

        System.out.println("---------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: R$ " + getSalario());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Numero do Caixa: " + numeroCaixa);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");

    }
}