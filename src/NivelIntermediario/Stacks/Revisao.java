package NivelIntermediario.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Revisao {
    public static void main(String[] args) {

        System.out.println("---------ARRAY---------");

        /*
        * Arrays
        * Sao estaticos e exigem um tamanho pré definido
        * */

        String[] nomeNinjaArray = new String[5];
        nomeNinjaArray[0] = "naruto uzumaki";
        nomeNinjaArray[1] = "sasuke uchiha";
        nomeNinjaArray[2] = "sakura haruno";
        nomeNinjaArray[3] = "Hinata";
        System.out.println("nomeNinjaArray = " + nomeNinjaArray[1]);
        for (int i = 0; i < nomeNinjaArray.length; i++) {
            System.out.println(nomeNinjaArray[i]);
        }

        System.out.println("---------LISTA---------");

        /*
        * Lista é mais lenta em comparacão com ARRAY
        * Sao dinamicas e diminuem o tamanho conforme precisamos
        * */

        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("naruto uzumaki");
        nomeNinjaList.add("sasuke uchiha");
        nomeNinjaList.add("sakura haruno");
        nomeNinjaList.add("itachi uchiha");
        nomeNinjaList.add("madara uchiha");
        System.out.println("nomeNinjaList = " + nomeNinjaList);

        System.out.println("---------STACK---------");

        /*
        * Stacks sao unicos
        * exigem uma ordem! o ultimo a entrar é o primeiro a sair = LIFO
        * */

        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("naruto uzumaki");
        nomeNinjaStack.push("sasuke uchiha");
        nomeNinjaStack.push("itachi uchiha");
        nomeNinjaStack.push("madara uchiha");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar a pilha: " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("ver quem sera o proximo a sair: " + nomeNinjaStack.peek());

    }


}
