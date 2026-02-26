package Selection;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public List<Integer> sort(List<Integer> numbers){
    List<Integer> ordenada = new ArrayList<>();
    
    // Enquanto houver números na lista original
    while (!numbers.isEmpty()) {
        int indiceDoMenor = 0;

        // Loop para encontrar o índice do menor elemento atual
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(indiceDoMenor)) {
                indiceDoMenor = i;
            }
        }

        // Remove da original e adiciona na nova
        int menorValor = numbers.remove(indiceDoMenor);
        ordenada.add(menorValor);
    }
    
    return ordenada;
}

}

