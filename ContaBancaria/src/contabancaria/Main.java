package contabancaria;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int opcao;

        do{
            System.out.println("\n" + "Menu:" + "\n");
            System.out.println("1-Depósitar");
            System.out.println("2-Sacar");
            System.out.println("3-Transferir");
            System.out.println("4-Consultar saldo");
            System.out.println("5-Alterar titular");
            System.out.println("6-Extrato");
            System.out.println("7-Sair");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch(opcao){
                case 1:
                    conta.depositar(teclado);
                    break;
                case 2:
                    conta.sacar(teclado);
                    break;
                case 3:
                    conta.transferir(teclado);
                    break;
                case 4:
                    conta.consultar();
                    break;
                case 5:
                    conta.alterar(teclado);
                    break;
                case 6:
                    conta.extrato();
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }while (opcao != 7);
    }
}