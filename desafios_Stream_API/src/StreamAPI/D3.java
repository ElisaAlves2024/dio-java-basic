package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D3 {

    private List<Integer> numerosList;
    
    public D3() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void todosOsNumerosPositivosUm() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        boolean todosOsNumerosSaoPositivos = false;
        List<Integer> numerosNegativos = numerosList.stream().filter(n -> n < 0).collect(Collectors.toList());
        if (numerosNegativos.size() == 0) {
            todosOsNumerosSaoPositivos = true;
        }
        System.out.println(todosOsNumerosSaoPositivos);      
    }

    public void todosOsNumerosPositivosDois() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        boolean todosNumerosSaoPositivos = numerosList.stream().allMatch(n -> n > 0);
        System.out.println("Todos os números da lista são positivos: " + todosNumerosSaoPositivos);
    }



public static void main(String[] args) throws Exception {
       
    D3 numeros = new D3();

    numeros.todosOsNumerosPositivosUm();
    numeros.todosOsNumerosPositivosDois();


}
}
