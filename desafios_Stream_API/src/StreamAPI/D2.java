package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D2 {

    private List<Integer> numerosList;
    
    public D2() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void somaNumerosPares() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        List<Integer> numerosPares = numerosList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        int soma = numerosPares.stream().reduce(0, (sub, n) -> sub + n);
        System.out.println(soma);       
    }


public static void main(String[] args) throws Exception {
       
    D2 numeros = new D2();

    numeros.somaNumerosPares();


}
}
