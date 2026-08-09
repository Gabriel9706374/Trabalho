package projeto.integrador;

public class Caixa {
    private static int contador = 1;
    private int numero;
    private Funcionario operador;
    private String status;

    public Caixa(){
        numero = contador;
        contador++;
        status = "FECHADO";
    }

    public int getNumero(){
        return numero;
    }

    public Funcionario getOperador(){
        return operador;
    }

    public void setOperador(Funcionario operador){
        this.operador = operador;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void abrirCaixa(){
        status = "ABERTO";
        System.out.println("Caixa aberto com sucesso!");
    }

    public void fecharCaixa(){
        status = "FECHADO";
        System.out.println("Caixa fechado com sucesso!");
    }

    public void mostrarDados(){
        System.out.println("---------------------------");
        System.out.println("Numero do Caixa: " + numero);
        if (operador != null) {
            System.out.println("Operador: " + operador.getNome());
        } else {
            System.out.println("Operador: Nenhum");
        }
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
} 