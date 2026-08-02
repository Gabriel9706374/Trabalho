package petshop;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        pet pet = new pet();

        System.out.println("Nome:");
        pet.setNome(teclado.nextLine());
        System.out.println("Especie:");
        pet.setEspecie(teclado.nextLine());
        System.out.println("Idade:");
        pet.setIdade(teclado.nextInt());
        System.out.println("Peso:");
        pet.setPeso(teclado.nextDouble());

        int opcao;

        do{

            System.out.println("\n" + "PET SHOP JAVA" + "\n");
            System.out.println("1 - Mostrar ficha");
            System.out.println("2 - Alimentar");
            System.out.println("3 - Brincar");
            System.out.println("4 - Dormir");
            System.out.println("5 - Verificar estado");
            System.out.println("6 - Calcular banho");
            System.out.println("7 - Verificar saude");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    pet.mostrarFicha();
                    break;
                    
                case 2:
                    pet.alimentar();
                    break;
                    
                case 3:
                    pet.brincar();
                    break;
                    
                case 4:
                    pet.dormir();
                    break;
                case 5:
                    pet.verificarEstado();
                    break;
                    
                case 6:
                    pet.calcularBanho();
                    break;
                    
                case 7:
                    pet.verificarSaude();
                    break;
                    
                case 8:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }while (opcao != 8);
    }
}