package NivelIntermediario.HashSet;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto uzumaki");
        ninjas.add("Sasuke uchiha");
        ninjas.add("Sakura haruno");
        ninjas.add("Sakura haruno");

        System.out.println(ninjas);

        // Usado quando nao queremos itens duplicados
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println(ninjasSet);

    }
}
