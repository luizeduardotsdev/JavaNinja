package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
        * Queue / Fila
        * O primeiro a entrar é o primeiro a sair = FIFO
        *
        * nao é possivel deletar o tail(ultimo)
        * */

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("naruto");
        ninjasQueue.add("sasuke");
        ninjasQueue.add("sakura");
        ninjasQueue.add("kakashi");
        ninjasQueue.add("shikamaru");

        // mostrar fila
        System.out.println("ninjas na fila: " + ninjasQueue);

        // tirar o head da lista
        ninjasQueue.poll();
        System.out.println("ninjas na fila: " + ninjasQueue);

        // como ver o head
        System.out.println("Elemento do topo: " + ninjasQueue.peek());

        // como adicionar a fila
        ninjasQueue.add("hashirama");
        ninjasQueue.add("tobirama");

        System.out.println(ninjasQueue);

        // esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();


        // verificar se esta vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila esta vazia" + ninjasQueue);
        }

    }
}
