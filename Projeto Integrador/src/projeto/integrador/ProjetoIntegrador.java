package projeto.integrador;

import java.util.Scanner;
public class ProjetoIntegrador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Loja loja = new Loja();

        int opcao;

        do {
            System.out.println("\n" + "MENU" + "\n");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Cadastrar Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionarios");
            System.out.println("5 - Listar Caixas");
            System.out.println("6 - Listar Pagamentos");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1:
                    Funcionario funcionario = new Funcionario();
                    System.out.print("Nome: ");
                    funcionario.setNome(teclado.nextLine());
                    System.out.print("CPF: ");
                    funcionario.setCpf(teclado.nextLine());
                    System.out.print("Salario: ");
                    funcionario.setSalario(teclado.nextDouble());
                    teclado.nextLine();
                    System.out.print("Cargo: ");
                    funcionario.setCargo(teclado.nextLine());
                    loja.cadastrarFuncionario(funcionario);
                    System.out.println("Funcionario cadastrado com sucesso!");
                    break;
                case 2:
                    Caixa caixa = new Caixa();
                    Funcionario operador = new Funcionario();
                    System.out.print("Nome do operador: ");
                    operador.setNome(teclado.nextLine());
                    caixa.setOperador(operador);
                    caixa.abrirCaixa();
                    loja.cadastrarCaixa(caixa);
                    System.out.println("Caixa cadastrado com sucesso!");
                    break;
                case 3:
                    Pagamento pagamento = new Pagamento();
                    System.out.print("Valor da venda: ");
                    pagamento.setValorVenda(teclado.nextDouble());
                    teclado.nextLine();
                    System.out.print("Modalidade de pagamento: ");
                    pagamento.setModalidadePagamento(teclado.nextLine());
                    pagamento.realizarPagamento();
                    loja.cadastrarPagamento(pagamento);
                    break;
                case 4:
                    loja.listarFuncionarios();
                    break;
                case 5:
                    loja.listarCaixas();
                    break;
                case 6:
                    loja.listarPagamentos();
                    break;
                case 7:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 7);
    }
}