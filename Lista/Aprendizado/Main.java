package Lista.Aprendizado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Ola");
        lista.add(0,"Hello");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        lista.set(1,"Ola mundo");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        System.out.println(lista.size());

        //System.out.println(lista.contains());
        System.out.println("Lista esta vazia: " + lista.isEmpty());

        lista.remove(1);

        System.out.println(lista.get(0));

        lista.clear();

        System.out.println("Lista esta vazia: " + lista.isEmpty());

    }
}
