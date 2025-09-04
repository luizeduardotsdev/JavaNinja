package NivelIntermediario.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        * Collection
        * */

        ArrayList<String> lista = new ArrayList<>();

        LinkedList<String> list = new LinkedList<>();
        list.add("naruto uzumaki");
        list.add("sasuke uchiha");
        list.add("sakura haruno");
        System.out.println(list);

        list.add(1, "kakashi hatake");
        list.remove(2);
        System.out.println(list);

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

    }
}
