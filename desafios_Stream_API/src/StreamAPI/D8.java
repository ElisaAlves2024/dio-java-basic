package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class D8 {

    private List<Integer> numerosList;
    
    public D8() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    //nao consegui  
    public void somarDigitos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        Integer somaDigitos = numerosList.stream().map(n -> String.valueOf(n)).forEach(String -> String.toCharArray());;
        


public static void main(String[] args) throws Exception {
       
    D8 numeros = new D8();

    numeros.somarDigitos();


}
}
