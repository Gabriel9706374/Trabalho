package projeto.integrador;

import java.util.ArrayList;
public class Loja {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Caixa> caixas;
    private ArrayList<Pagamento> pagamentos;

    public Loja(){
        funcionarios = new ArrayList<>();
        caixas = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    public void cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void cadastrarCaixa(Caixa caixa){
        caixas.add(caixa);
    }

    public void cadastrarPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
    }

    public void listarFuncionarios(){
        if (funcionarios.isEmpty()){
            System.out.println("Nenhum funcionario cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios){
                funcionario.mostrarDados();
            }
        }
    }

    public void listarCaixas(){
        if (caixas.isEmpty()){
            System.out.println("Nenhum caixa cadastrado.");
        } else {
            for (Caixa caixa : caixas){
                caixa.mostrarDados();
            }
        }
    }

    public void listarPagamentos(){
        if (pagamentos.isEmpty()) {
            System.out.println("Nenhum pagamento realizado.");
        } else {
            for (Pagamento pagamento : pagamentos) {
                pagamento.mostrarPagamento();
            }
        }
    }
}