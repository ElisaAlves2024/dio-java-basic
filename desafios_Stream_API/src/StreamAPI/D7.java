package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class D7 {

    private List<Integer> numerosList;
    
    public D7() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void encontrarSegundoMaior() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> numerosEmOrdem = numerosList.stream().sorted().collect(Collectors.toList());
        Optional<Integer> segundoMaiorNumero = numerosEmOrdem.stream().skip((numerosEmOrdem.size())-2).findFirst();
        System.out.println(segundoMaiorNumero);
    }


public static void main(String[] args) throws Exception {
       
    D7 numeros = new D7();

    numeros.encontrarSegundoMaior();


}
}