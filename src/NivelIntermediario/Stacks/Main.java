package NivelIntermediario.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        * Array
        * Sao estaticos e tem referencia de memoria
        * */

        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Sasuke";

        /*
        * Listas
        * Listas sao dinamicas e o tamanho aumenta e diminui
        * */

        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("naruto");

        /*
        * Stack
        * O ultimo elemento que entrou é obrigatoriamente a sair
        * */

        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("naruto");
        ninjaStack.push("jiraya");
        ninjaStack.push("hinata");
        ninjaStack.push("kakashi");
        ninjaStack.push("sasuke");
        ninjaStack.push("sakura");
        System.out.println(ninjaStack);
        ninjaStack.pop();
        System.out.println(ninjaStack);
        System.out.println("Elemento do topo: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size());
    }
}
