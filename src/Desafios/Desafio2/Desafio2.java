package Desafios.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // opcao switch
        int opcao;

        int quantidade = 0;
        // Array
        String[] nomeNinja = new String[10];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade de ninja");
                    quantidade = input.nextInt();

                    if (quantidade >= 1) {
                        for (int i = 1; i < quantidade + 1; i++) {
                            System.out.println("Digite o nome do ninja de numero " + i );
                            nomeNinja[i] = input.next();
                        }
                    } else {
                        System.out.println("0 ninjas cadastrados");
                    }
                    break;
                case 2:
                    if (nomeNinja.length > 0) {
                        for (int i = 0; i < nomeNinja.length; i++) {
                            System.out.println(nomeNinja[i]);
                        }
                    } else {
                        System.out.println("0 ninjas cadastrados");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema de cadastro");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente!");
                    break;
            }

        } while (opcao != 3);

        input.close();
    }
}
