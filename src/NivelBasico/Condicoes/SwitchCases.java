package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        *  SwitchCases: Servem para gerar casos especificos
        *  objective: Pedir pro usuario escolher entre os ninjas
        * */

        // Pedir para o usuario
        Scanner input = new Scanner(System.in);

        // mostrando opcoes
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        // pedindo escolha
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O usuario escolheu naruto");
                break;
            case 2:
                System.out.println("O usuario escolheu sasuke");
                break;
            case 3:
                System.out.println("O usuario escolheu sakura");
                break;
            default:
                System.out.println("Numero incorreto, tente novamente");
        }

        // fechar a caixa
        input.close();
    }
}
