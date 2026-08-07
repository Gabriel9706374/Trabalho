package loja;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        fornecedor fornecedor1 = new fornecedor(
                "Tech Distribuidora",
                "(51) 99999-9999",
                "12.345.678/0001-90");

        alimento alimento = new alimento(
                "Arroz",
                25.90,
                50,
                "10/12/2026",
                fornecedor1);

        eletronico eletronico = new eletronico(
                "Notebook",
                3500.00,
                15,
                24,
                fornecedor1);

        smartphone smartphone = new smartphone(
                "Galaxy",
                2500.00,
                20,
                12,
                fornecedor1,
                "Samsung",
                6.5);

        System.out.println("Escolha o tipo de produto:");
        System.out.println("1 - Alimento");
        System.out.println("2 - Eletronico");
        System.out.println("3 - Smartphone");

        int tipo = teclado.nextInt();

        int opcao;

        do {

            System.out.println("\nMENU\n");
            System.out.println("1 - Apresentar informacoes");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Repor estoque");
            System.out.println("4 - Verificar validade");
            System.out.println("5 - Calcular garantia restante");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    if (tipo == 1) {

                        alimento.apresentar();

                    } else if (tipo == 2) {

                        eletronico.apresentar();

                    } else if (tipo == 3) {

                        smartphone.apresentar();

                    }

                    break;

                case 2:

                    System.out.println("1 - Venda sem desconto");
                    System.out.println("2 - Venda com desconto");
                    int tipo_venda = teclado.nextInt();

                    System.out.print("Valor do pagamento: ");
                    double pagamento = teclado.nextDouble();

                    if (tipo_venda == 1) {

                        if (tipo == 1)
                            alimento.vender(pagamento);
                        else if (tipo == 2)
                            eletronico.vender(pagamento);
                        else
                            smartphone.vender(pagamento);

                    } else if (tipo_venda == 2) {

                        System.out.print("Desconto (%): ");
                        double desconto = teclado.nextDouble();

                        if (tipo == 1)
                            alimento.vender(pagamento, desconto);
                        else if (tipo == 2)
                            eletronico.vender(pagamento, desconto);
                        else
                            smartphone.vender(pagamento, desconto);

                    } else {

                        System.out.println("Opcao invalida!");

                    }

                    break;

                case 3:

                    System.out.print("Quantidade para repor: ");
                    int reposicao = teclado.nextInt();

                    if (tipo == 1)
                        alimento.reporEstoque(reposicao);
                    else if (tipo == 2)
                        eletronico.reporEstoque(reposicao);
                    else
                        smartphone.reporEstoque(reposicao);

                    break;

                case 4:

                    if (tipo == 1) {

                        alimento.verificarValidade();

                    } else {

                        System.out.println("Opcao disponivel apenas para alimentos.");

                    }

                    break;

                case 5:

                    if (tipo == 2) {

                        System.out.print("Meses decorridos desde a compra: ");
                        int meses = teclado.nextInt();

                        eletronico.calcularGarantiaRestante(meses);

                    } else if (tipo == 3) {

                        System.out.print("Meses decorridos desde a compra: ");
                        int meses = teclado.nextInt();

                        smartphone.calcularGarantiaRestante(meses);

                    } else {

                        System.out.println("Opcao disponivel apenas para eletronicos.");

                    }

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