package Desafios.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> lista = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        int opcao;

        lista.add(new Ninja("Itachi", 35, "Folha"));
        lista.add(new Ninja("Madara", 40, "Folha"));
        lista.add(new Ninja("Gaara", 18, "Areia"));
        lista.add(new Ninja("Sakura", 18, "Folha"));
        lista.add(new Ninja("Sasuke", 19, "Folha"));
        lista.add(new Ninja("Naruto", 18, "Folha"));


        do {
            System.out.println("1-Adicionar um ninja no inicio \n2-Remover o primeiro ninja \n3-Listar ninjas \n4-Procurar um ninja por indice \n5-Ordenar lista \n6-Sair");
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
                    System.out.println("Removendo o primeiro ninja");
                    System.out.println(lista.peekFirst());
                    lista.removeFirst();
                    break;
                case 3:
                    System.out.println("Lista de ninjas: ");
                    for(Ninja ninja : lista) {
                        System.out.println(ninja);
                    }
                    break;
                case 4:

                    System.out.println("1-Buscar por nome \n2-Buscar por indice \n3-Sair");

                    switch (input.nextInt()) {
                        case 1:
                            System.out.println("Digite o nome do ninja: ");
                            String nomeProcurado = input.next();

                            for (Ninja p : lista) {
                                if (p.getNome().equalsIgnoreCase(nomeProcurado)) {

                                    System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade() + " Vila: " + p.getVila());
                                    break;

                                } else {
                                    System.out.println(nomeProcurado + " Nao encontrado");
                                }
                            }

                        case 2:
                            System.out.println("Qual posicao do index?");
                            int index = input.nextInt();
                            System.out.println(lista.get(index + -1));
                            break;
                        case 3:
                            System.out.println("Saindo...");
                        default:
                            System.out.println("Tente novamente");
                            break;
                    }

                case 5:
                    System.out.println("1-Ordenar por idade crescente \n2-Ordernar por idade descrescente \n3-Ordernar por nome em ordem alfabetica \n4-Ordernar por vila em ordem alfabetica \n5-Sair");

                    switch (input.nextInt()) {
                        case 1:
                            lista.sort(Comparator.comparing(Ninja::getIdade));
                            System.out.println(lista);
                            break;
                        case 2:
                            lista.sort(Comparator.comparing(Ninja::getIdade).reversed());
                            System.out.println(lista);
                            break;
                        case 3:
                            lista.sort(Comparator.comparing(Ninja::getNome));
                            System.out.println(lista);
                            break;
                        case 4:
                            lista.sort(Comparator.comparing(Ninja::getVila));
                            System.out.println(lista);
                            break;
                        case 5:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Tente novamente");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Tente novamente");
                    break;

            }

        } while (opcao != 6);

        input.close();

    }
}
