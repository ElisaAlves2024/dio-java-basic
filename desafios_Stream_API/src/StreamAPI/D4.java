package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D4 {

    private List<Integer> numerosList;
    
    public D4() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void removerNumerosImpares() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        List<Integer> numerosPares = numerosList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(numerosPares);       
    }


public static void main(String[] args) throws Exception {
       
    D4 numeros = new D4();

    numeros.removerNumerosImpares();


}
}
