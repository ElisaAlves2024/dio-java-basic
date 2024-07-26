package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D10 {

    private List<Integer> numerosList;
    
    public D10() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void agruparNumerosPorCondição() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        
        List<Integer> numerosCondicao = numerosList.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).collect(Collectors.toList());
        System.out.println(numerosCondicao);       
    }


public static void main(String[] args) throws Exception {
       
    D10 numeros = new D10();

    numeros.agruparNumerosPorCondição();


}
}
