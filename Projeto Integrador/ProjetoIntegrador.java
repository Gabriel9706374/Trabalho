package projeto.integrador;

import java.util.Scanner;

public class ProjetoIntegrador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Loja loja = new Loja();

        int opcao;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Operador de Caixa");
            System.out.println("3 - Realizar Pagamento");
            System.out.println("4 - Listar Funcionarios");
            System.out.println("5 - Listar Pagamentos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    Gerente gerente = new Gerente();

                    System.out.print("Nome: ");
                    gerente.setNome(teclado.nextLine());

                    System.out.print("CPF: ");
                    gerente.setCpf(teclado.nextLine());

                    System.out.print("Salario: ");
                    gerente.setSalario(teclado.nextDouble());
                    teclado.nextLine();

                    System.out.print("Setor: ");
                    gerente.setSetor(teclado.nextLine());

                    System.out.print("Bonus: ");
                    gerente.setBonus(teclado.nextDouble());
                    teclado.nextLine();

                    loja.adicionarFuncionario(gerente);

                    break;

                case 2:

                    OperadorCaixa operador = new OperadorCaixa();

                    System.out.print("Nome: ");
                    operador.setNome(teclado.nextLine());

                    System.out.print("CPF: ");
                    operador.setCpf(teclado.nextLine());

                    System.out.print("Salario: ");
                    operador.setSalario(teclado.nextDouble());
                    teclado.nextLine();

                    loja.adicionarFuncionario(operador);

                    System.out.println("Numero do Caixa: "
                            + operador.getNumeroCaixa());

                    break;

                case 3:

                    Pagamento pagamento = new Pagamento();

                    System.out.print("Valor do pagamento: ");
                    pagamento.setValor(teclado.nextDouble());
                    teclado.nextLine();

                    System.out.print("Modalidade de pagamento: ");
                    pagamento.setModalidadePagamento(teclado.nextLine());

                    pagamento.realizarPagamento();

                    loja.adicionarPagamento(pagamento);

                    break;

                case 4:

                    loja.listarFuncionarios();

                    break;

                case 5:

                    loja.listarPagamentos();

                    break;

                case 6:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 6);
    }
}