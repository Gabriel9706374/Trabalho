package loja;

import java.util.Scanner;
public class main {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

        alimento alimento = new alimento(
                "Arroz", 25.90, 50, "10/12/2026");

        eletronico eletronico = new eletronico(
                "Notebook", 3500.00, 15, 24);

        System.out.println("Escolha o tipo de produto:");
        System.out.println("1 - Alimento");
        System.out.println("2 - Eletrônico");
        int tipo = sc.nextInt();

        int opcao;

        do {

            System.out.println("\n" + "MENU" + "\n");
            System.out.println("1 - Apresentar informações");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Repor estoque");
            System.out.println("4 - Verificar validade");
            System.out.println("5 - Calcular garantia restante");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    if (tipo == 1)
                        alimento.apresentar();
                    else
                        eletronico.apresentar();
                    break;

                case 2:
                    System.out.print("Quantidade para vender: ");
                    int venda = sc.nextInt();

                    if (tipo == 1)
                        alimento.vender(venda);
                    else
                        eletronico.vender(venda);

                    break;

                case 3:
                    System.out.print("Quantidade para repor: ");
                    int reposicao = sc.nextInt();

                    if (tipo == 1)
                        alimento.reporEstoque(reposicao);
                    else
                        eletronico.reporEstoque(reposicao);

                    break;

                case 4:
                    if (tipo == 1)
                        alimento.verificarValidade();
                    else
                        System.out.println("Opção disponível apenas para alimentos.");
                    break;

                case 5:
                    if (tipo == 2) {
                        System.out.print("Meses decorridos desde a compra: ");
                        int meses = sc.nextInt();
                        eletronico.calcularGarantiaRestante(meses);
                    } else {
                        System.out.println("Opção disponível apenas para eletrônicos.");
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 6);

        sc.close();
    }
}