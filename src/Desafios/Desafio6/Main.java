package Desafios.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> lista = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        int opcao;

        Ninja ninja1 = new Ninja("Naruto", 18, "Folha");
        Ninja ninja2 = new Ninja("Sasuke", 19, "Folha");
        Ninja ninja3 = new Ninja("Sakura", 18, "Folha");
        Ninja ninja4 = new Ninja("Gaara", 18, "Areia");
        Ninja ninja5 = new Ninja("Madara", 40, "Folha");
        Ninja ninja6 = new Ninja("Itachi", 35, "Folha");



        lista.add(ninja1);
        lista.add(ninja2);
        lista.add(ninja3);
        lista.add(ninja4);
        lista.add(ninja5);
        lista.add(ninja6);

        do {
            System.out.println("1-Adicionar um ninja no inicio \n2-Remover um ninja \n3-Listar ninjas \n4-Procurar um ninja por indice \n5-Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do ninja: ");
                    String nome = input.next();
                    input.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    int idade = input.nextInt();
                    System.out.println("Digite a vila do ninja: ");
                    String vila = input.next();
                    lista.addFirst(new Ninja(nome, idade, vila));
                    break;
                case 2:
                    System.out.println("Digite qual ninja quer remover: ");
                    int remover = input.nextInt();
                    System.out.println("Ninja " + lista.get(remover) + " Removido com sucesso!");
                    lista.remove(remover);
                    break;
                case 3:
                    System.out.println("Lista de ninjas: ");
                    System.out.println(lista);
                    break;
                case 4:
                    System.out.println("Qual posicao do index?");
                    int index = input.nextInt();
                    System.out.println(lista.get(index + -1));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Tente novamente");
                    break;

            }

        } while (opcao != 5);

        input.close();

    }
}
