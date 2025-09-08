package NivelIntermediario.HashSet.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
            List<String> ninjasLista = new ArrayList<>();
            ninjasLista.add("Naruto uzumaki");
            ninjasLista.add("Sasuke uchiha");
            ninjasLista.add("Sakura haruno");
            ninjasLista.add("Sakura haruno");
            ninjasLista.add("Danzo");
            ninjasLista.add("Kakashi hatake");
            ninjasLista.add("Boruto");

            System.out.println(ninjasLista);

            // Usando quando nao queremos que apareça itens duplicados mas em ordem alfabetica
            Set<String> ninjasSet = new TreeSet<>();
            ninjasSet.addAll(ninjasLista);

            System.out.println(ninjasSet);

    }
}
