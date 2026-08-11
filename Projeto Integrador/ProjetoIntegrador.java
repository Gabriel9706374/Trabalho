package projeto.integrador;

import java.util.Scanner;
public class ProjetoIntegrador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Loja loja = new Loja();

        Gerente gerenteInicial = new Gerente();
        gerenteInicial.setNome("Administrador");
        gerenteInicial.setCpf("000.000.000-00");
        gerenteInicial.setSalario(0);
        gerenteInicial.setSetor("Administracao");
        gerenteInicial.setBonus(0);
        gerenteInicial.setSenha("1234");

        loja.adicionarFuncionario(gerenteInicial);

        int opcao;

        do {

            System.out.println("\n========================================");
            System.out.println("             LOJA JAVAVEIRA");
            System.out.println("========================================");
            System.out.println("1 - Acessar Sistema");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    acessarSistema(loja, teclado);

                    break;

                case 2:

                    System.out.println("\nSistema encerrado.");

                    break;

                default:

                    System.out.println("\nOpcao invalida!");

            }

        } while (opcao != 2);

        teclado.close();

    }

    public static void acessarSistema(Loja loja, Scanner teclado) {

        int perfil;

        do {

            System.out.println("\n========================================");
            System.out.println("             ACESSAR SISTEMA");
            System.out.println("========================================");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador de Caixa");
            System.out.println("3 - Voltar");
            System.out.print("Escolha uma opcao: ");

            perfil = teclado.nextInt();
            teclado.nextLine();

            switch (perfil) {

                case 1:

                    realizarLoginGerente(loja, teclado);

                    break;

                case 2:

                    realizarLoginOperador(loja, teclado);

                    break;

                case 3:

                    System.out.println("Voltando...");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        } while (perfil != 3);

    }

    public static void realizarLoginGerente(Loja loja, Scanner teclado) {

        System.out.println("\n===== LOGIN DO GERENTE =====");

        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        Funcionario funcionario = loja.buscarFuncionarioPorId(id);

        if (funcionario == null) {

            System.out.println("Funcionario nao encontrado!");

            return;
        }

        if (!(funcionario instanceof Gerente)) {

            System.out.println("Este funcionario nao possui acesso de gerente!");

            return;
        }

        if (!funcionario.getSenha().equals(senha)) {

            System.out.println("Senha incorreta!");

            return;
        }

        System.out.println("\nLogin realizado com sucesso!");

        menuGerente((Gerente) funcionario, loja, teclado);

    }

    public static void realizarLoginOperador(Loja loja, Scanner teclado) {

        System.out.println("\n===== LOGIN DO OPERADOR =====");

        System.out.print("ID: ");
        int id = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        Funcionario funcionario = loja.buscarFuncionarioPorId(id);

        if (funcionario == null) {

            System.out.println("Funcionario nao encontrado!");

            return;
        }

        if (!(funcionario instanceof OperadorCaixa)) {

            System.out.println("Este funcionario nao possui acesso de operador!");

            return;
        }

        if (!funcionario.getSenha().equals(senha)) {

            System.out.println("Senha incorreta!");

            return;
        }

        System.out.println("\nLogin realizado com sucesso!");

        menuOperador((OperadorCaixa) funcionario, loja, teclado);

    }

    public static void menuGerente(
            Gerente gerente,
            Loja loja,
            Scanner teclado) {

        int opcao;

        do {

            System.out.println("\n========================================");
            System.out.println("             MENU GERENTE");
            System.out.println("========================================");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Listar Funcionarios");
            System.out.println("4 - Gerar Relatorio de Vendas");
            System.out.println("5 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    cadastrarOperador(loja, teclado);

                    break;

                case 2:

                    cadastrarGerente(loja, teclado);

                    break;

                case 3:

                    loja.listarFuncionarios();

                    break;

                case 4:

                    loja.gerarRelatorioVendas();

                    break;

                case 5:

                    System.out.println("Saindo do menu do gerente...");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 5);

    }

    public static void cadastrarOperador(
            Loja loja,
            Scanner teclado) {

        System.out.println("\n===== CADASTRO DE FUNCIONARIO =====");

        OperadorCaixa operador = new OperadorCaixa();

        System.out.print("Nome: ");
        operador.setNome(teclado.nextLine());

        System.out.print("CPF: ");
        operador.setCpf(teclado.nextLine());

        System.out.print("Salario: ");
        operador.setSalario(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Senha: ");
        operador.setSenha(teclado.nextLine());

        loja.adicionarFuncionario(operador);

        System.out.println("ID do funcionario: " + operador.getId());

    }

    public static void cadastrarGerente(
            Loja loja,
            Scanner teclado) {

        System.out.println("\n===== CADASTRO DE GERENTE =====");

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

        System.out.print("Senha: ");
        gerente.setSenha(teclado.nextLine());

        loja.adicionarFuncionario(gerente);

        System.out.println("ID do gerente: " + gerente.getId());

    }

    public static void menuOperador(
            OperadorCaixa operador,
            Loja loja,
            Scanner teclado) {

        int opcao;

        do {

            System.out.println("\n========================================");
            System.out.println("          MENU OPERADOR DE CAIXA");
            System.out.println("========================================");
            System.out.println("Caixa: " + operador.getNumeroCaixa());
            System.out.println("Status: " + operador.getStatus());
            System.out.println("----------------------------------------");
            System.out.println("1 - Abrir Caixa");
            System.out.println("2 - Realizar Pagamento");
            System.out.println("3 - Fechar Caixa");
            System.out.println("4 - Listar Pagamentos");
            System.out.println("5 - Voltar");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    operador.abrirCaixa();

                    break;

                case 2:

                    realizarPagamento(operador, loja, teclado);

                    break;

                case 3:

                    operador.fecharCaixa();

                    break;

                case 4:

                    loja.listarPagamentos();

                    break;

                case 5:

                    System.out.println("Saindo do menu do operador...");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 5);

    }

    public static void realizarPagamento(
            OperadorCaixa operador,
            Loja loja,
            Scanner teclado) {

        if (!operador.getStatus().equals("ABERTO")) {

            System.out.println("\nO caixa esta fechado!");
            System.out.println("Abra o caixa antes de realizar um pagamento.");

            return;
        }

        System.out.println("\n===== FORMA DE PAGAMENTO =====");
        System.out.println("1 - PIX");
        System.out.println("2 - Boleto");
        System.out.println("3 - Cartao");
        System.out.print("Escolha: ");

        int formaPagamento = teclado.nextInt();
        teclado.nextLine();

        switch (formaPagamento) {

            case 1:

                realizarPagamentoPix(loja, teclado);

                break;

            case 2:

                realizarPagamentoBoleto(loja, teclado);

                break;

            case 3:

                realizarPagamentoCartao(loja, teclado);

                break;

            default:

                System.out.println("Forma de pagamento invalida!");

        }

    }

    public static void realizarPagamentoPix(
            Loja loja,
            Scanner teclado) {

        Pix pix = new Pix();

        System.out.print("Valor: ");
        pix.setValor(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Chave PIX: ");
        pix.setChavePix(teclado.nextLine());

        pix.realizarPagamento();

        if (pix.getStatus().equals("APROVADO")) {

            loja.adicionarPagamento(pix);

        }

    }

    public static void realizarPagamentoBoleto(
            Loja loja,
            Scanner teclado) {

        Boleto boleto = new Boleto();

        System.out.print("Valor: ");
        boleto.setValor(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Codigo de barras: ");
        boleto.setCodigoBarras(teclado.nextLine());

        boleto.realizarPagamento();

        if (boleto.getStatus().equals("APROVADO")) {

            loja.adicionarPagamento(boleto);

        }

    }

    public static void realizarPagamentoCartao(
            Loja loja,
            Scanner teclado) {

        System.out.println("\n===== TIPO DE CARTAO =====");
        System.out.println("1 - Debito");
        System.out.println("2 - Credito");
        System.out.print("Escolha: ");

        int tipoCartao = teclado.nextInt();
        teclado.nextLine();

        if (tipoCartao == 1) {

            realizarPagamentoDebito(loja, teclado);

        } else if (tipoCartao == 2) {

            realizarPagamentoCredito(loja, teclado);

        } else {

            System.out.println("Tipo de cartao invalido!");

        }

    }

    public static void realizarPagamentoDebito(
            Loja loja,
            Scanner teclado) {

        Debito debito = new Debito();

        System.out.print("Valor: ");
        debito.setValor(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Numero do cartao: ");
        debito.setNumeroCartao(teclado.nextLine());

        System.out.print("Nome do titular: ");
        debito.setNomeTitular(teclado.nextLine());

        System.out.print("Bandeira: ");
        debito.setBandeira(teclado.nextLine());

        System.out.print("CVV: ");
        debito.setCvv(teclado.nextLine());

        System.out.print("Saldo disponivel: ");
        debito.setSaldoDisponivel(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Senha: ");
        debito.setSenha(teclado.nextLine());

        debito.realizarPagamento();

        if (debito.getStatus().equals("APROVADO")) {

            loja.adicionarPagamento(debito);

        }

    }

    public static void realizarPagamentoCredito(
            Loja loja,
            Scanner teclado) {

        System.out.println("\nPagamento a vista ou parcelado?");
        System.out.println("1 - A vista");
        System.out.println("2 - Parcelado");
        System.out.print("Escolha: ");

        int tipoCredito = teclado.nextInt();
        teclado.nextLine();

        Credito credito;

        if (tipoCredito == 2) {

            System.out.print("Quantidade de parcelas: ");
            int parcelas = teclado.nextInt();
            teclado.nextLine();

            credito = new Credito(parcelas);

        } else {

            credito = new Credito();

        }

        System.out.print("Valor: ");
        credito.setValor(teclado.nextDouble());
        teclado.nextLine();

        System.out.print("Numero do cartao: ");
        credito.setNumeroCartao(teclado.nextLine());

        System.out.print("Nome do titular: ");
        credito.setNomeTitular(teclado.nextLine());

        System.out.print("Bandeira: ");
        credito.setBandeira(teclado.nextLine());

        System.out.print("CVV: ");
        credito.setCvv(teclado.nextLine());

        System.out.print("Limite disponivel: ");
        credito.setLimiteDisponivel(teclado.nextDouble());
        teclado.nextLine();

        credito.realizarPagamento();

        if (credito.getStatus().equals("APROVADO")) {

            loja.adicionarPagamento(credito);

        }
    }
}