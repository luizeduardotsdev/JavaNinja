package NivelIntermediario.Generics.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar o array

    private List<T> item;

    // Construtor
    public BolsaNinja() {
        this.item = new ArrayList<>();
    }


    // Colocar ferramentas no nosso array

    public void adicionar(T item) {
        this.item.add(item);
    }

    // Mostrar ferramenta
    public void mostraFerramenta() {
        for (T item : this.item) {
            System.out.println(item.toString());
        }
    }

}
