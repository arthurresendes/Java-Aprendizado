import carro.Carro2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,3,5,7,9);
        List<String> listaNome = new ArrayList<>();

        listaNome.add("Arthur A");
        listaNome.add("Arthur A");
        listaNome.add("Arthur B");
        listaNome.add("Jose");
        listaNome.add("Maria");

        System.out.println(listaNome.get(0));

        for(String nome: listaNome){
            System.out.println(nome);
        }
        //listaNome.remove(1);
        for(String nome: listaNome){
            System.out.println(nome);
        }

        Set<String> setStr = new HashSet<>();
        setStr.add("Arthur");
        setStr.add("Jose");
        setStr.add("Jose");

        System.out.println("---------------------------------------");
        System.out.println("Set: " + setStr);
        System.out.println(setStr.contains("Jose"));

        System.out.println("---------------------------------------");
        Map<String, Integer> nomeIdade = new HashMap<>();
        nomeIdade.put("Arthur", 19);
        nomeIdade.put("Jose", 20);
        System.out.println("Map: " + nomeIdade);
        System.out.println(nomeIdade.get("Arthur"));
        nomeIdade.replace("Jose", 20, 21);
        System.out.println("Map: " + nomeIdade);

        System.out.println("---------------------------------------");
        Queue<String> queue = new LinkedList<>();
        queue.add("Arthur");
        queue.add("Jose");
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll()); //Remove o 1
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.peek()); // Pega o 1
        System.out.println("Queue: " + queue);
        // Se estiver vazio da erro com o remove e element. remove = pool, element = peek
        System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue);
        queue.add("Arthur");
        System.out.println("Queue: " + queue.element());
        System.out.println("Queue: " + queue);

        // Records são imutaveis
        Carro2 car2 = new Carro2("Gol", "Azul", 1990, "ABCDE-11");
        System.out.println(car2.modelo());
        System.out.println(car2.ano());

        // STREAM -> filter, map, reduce, agregações
        System.out.println(listaNome.stream().filter(nome -> nome.startsWith("Arthur")).toList());
        System.out.println(numeros.stream().map(n -> n *2).toList());
        System.out.println(numeros.stream().reduce(0, (ac, n) -> ac + n));
        System.out.println(numeros.stream().count());
        System.out.println(numeros.stream().mapToInt(n -> n).sum());
        System.out.println(numeros.stream().mapToInt(n -> n).average().orElse(0.0));

        System.out.println(listaNome.stream().map(ln -> ln.toUpperCase()).toList());
        System.out.println(listaNome.stream().map(String::toUpperCase).collect(Collectors.toSet()));
        System.out.println(nomeIdade.entrySet().stream().map(e -> e.getKey() + " tem " + e.getValue() + " anos").toList());
    }
}