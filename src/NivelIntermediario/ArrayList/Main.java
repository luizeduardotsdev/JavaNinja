package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Array:
        * Sao estaticos, nao mudam de tamanho
        * */
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        System.out.println("Print array" + ninjas[0]);
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }


        /*
        * Listas:
        * Nao sao estaticas, elas podem aumentar e diminuir
        * */

        // Adicionar na lista
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Uchiha");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakshi");

        System.out.println("Print list" + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakshi");

        System.out.println("Print list" + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Minato");
        System.out.println("Print list" + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho lista: " +  ninjasList.size());

    }
}
