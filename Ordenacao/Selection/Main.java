package Selection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        List<Integer> listas = new ArrayList<>(Arrays.asList(9,1,8,4,7,2,4,2,1));
        List<Integer> resultado = ss.sort(listas);
        System.out.println(ss.sort((resultado)));
    }
}
