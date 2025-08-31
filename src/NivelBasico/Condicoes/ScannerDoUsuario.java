package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner tras o usuario para dentro da aplicacao
        * Objective: user create a ninja
        * */

        // Abrir Scanner
        Scanner input = new Scanner(System.in);

        // Receber nome do ninja
        System.out.println("Digite o nome do Ninja: ");
        String nameNinja = input.nextLine();
        System.out.println("Nome: " + nameNinja);

        // Receber nome do ninja
        System.out.println("Digite a idade do Ninja: ");
        int idadeNinja = input.nextInt();
        System.out.println("idade do Ninja = " + idadeNinja);

        // Tratamento de dados
        if (idadeNinja >= 18) {
            System.out.println("O Ninja " + nameNinja + " possui mais que 18 anos");
        } else {
            System.out.println("O Ninja " + nameNinja + " é menor de idade");
        }

        // Sempre fechar Scanner
        input.close();
    }
}
