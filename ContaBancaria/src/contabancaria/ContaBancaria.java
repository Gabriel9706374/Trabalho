package contabancaria;

import java.util.Scanner;
public class ContaBancaria {

    String titular = "Sem Nome";
    double saldo;
    double saque;
    double transferencia;
    double depositos;

    void depositar(Scanner teclado){

        System.out.println("Valor do depósito:");
        double valor = teclado.nextDouble();

        if (valor > 0){
            saldo = saldo + valor;
            depositos = depositos + valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor invalido.");
        }
    }

    void sacar(Scanner teclado){
        System.out.println("Valor do saque:");
        double valor = teclado.nextDouble();

        if (valor <= saldo && valor > 0){
            saldo = saldo - valor;
            saque = saque + valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void transferir(Scanner teclado){
        System.out.println("Valor da transferência:");
        double valor = teclado.nextDouble();
        
        if (valor <= saldo && valor > 0){
            saldo = saldo - valor;
            transferencia = transferencia + valor;
            System.out.println("Transferencia realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void consultar(){
        System.out.println("Saldo: R$ " + saldo);
    }

    void alterar(Scanner teclado){
        System.out.println("Novo titular:");
        titular = teclado.nextLine();
        System.out.println("Titular alterado para: " + titular);
    }

    void extrato(){
        System.out.println("Titular: " + titular);
        System.out.println("Depositou: R$ " + depositos);
        System.out.println("Saques: R$ " + saque);
        System.out.println("Transferências: R$ " + transferencia);
        System.out.println("Saldo: R$ " + saldo);
    }
}