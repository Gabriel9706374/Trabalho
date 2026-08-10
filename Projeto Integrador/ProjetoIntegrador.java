package projeto.integrador;

import java.util.Scanner;

public class ProjetoIntegrador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Loja loja = new Loja();

        int opcao;

        do {

            System.out.println("\n===== BEM VINDO AO PDV =====");
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

                    System.out.print("Cargo: ");
                    gerente.setCargo(teclado.nextLine());

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

                    System.out.print("Cargo: ");
                    operador.setCargo(teclado.nextLine());

                    loja.adicionarFuncionario(operador);

                    break;

                case 3:

                    System.out.println("\n===== FORMA DE PAGAMENTO =====");
                    System.out.println("1 - PIX");
                    System.out.println("2 - Boleto");
                    System.out.println("3 - Cartao");
                    System.out.print("Escolha: ");

                    int formaPagamento = teclado.nextInt();
                    teclado.nextLine();

                    switch (formaPagamento) {

                        case 1:

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

                            break;

                        case 2:

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

                            break;

                        case 3:

                            System.out.println("\n===== TIPO DE CARTAO =====");
                            System.out.println("1 - Debito");
                            System.out.println("2 - Credito");
                            System.out.print("Escolha: ");

                            int tipoCartao = teclado.nextInt();
                            teclado.nextLine();

                            if (tipoCartao == 1) {

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

                            } else if (tipoCartao == 2) {

                                System.out.print("Pagamento a vista ou parcelado?");
                                System.out.println("\n1 - A vista");
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

                            } else {

                                System.out.println("Tipo de cartao invalido!");

                            }

                            break;

                        default:

                            System.out.println("Forma de pagamento invalida!");

                    }

                    break;

                case 4:

                    loja.listarFuncionarios();

                    break;

                case 5:

                    loja.listarPagamentos();

                    break;

                case 6:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opcao invalida!");

            }

        } while (opcao != 6);

        teclado.close();
    }
}