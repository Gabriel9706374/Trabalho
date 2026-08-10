package projeto.integrador;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Pagamento> pagamentos;

    public Loja() {

        funcionarios = new ArrayList<>();
        pagamentos = new ArrayList<>();

    }

    public void adicionarFuncionario(Funcionario funcionario) {

        for (Funcionario funcionarioLista : funcionarios) {

            if (funcionarioLista.getId() == funcionario.getId()) {

                System.out.println("Ja existe um funcionario com esse ID.");
                return;

            }

        }

        funcionarios.add(funcionario);

        System.out.println("Funcionario cadastrado com sucesso!");
    }

    public void listarFuncionarios() {

        if (funcionarios.isEmpty()) {

            System.out.println("Nenhum funcionario cadastrado.");

        } else {

            for (Funcionario funcionario : funcionarios) {

                funcionario.mostrarDados();

            }

        }
    }

    public void adicionarPagamento(Pagamento pagamento) {

        pagamentos.add(pagamento);

        System.out.println("Pagamento cadastrado com sucesso!");
    }

    public void listarPagamentos() {

        if (pagamentos.isEmpty()) {

            System.out.println("Nenhum pagamento realizado.");

        } else {

            for (Pagamento pagamento : pagamentos) {

                pagamento.mostrarPagamento();

            }
        }
    }
}