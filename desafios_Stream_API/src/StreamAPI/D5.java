package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D5 {

    private List<Integer> numerosList;
    
    public D5() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void calcularMediaNumerosMaiorCinco() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> numerosMaiorCinco = numerosList.stream().filter(n -> n > 5).collect(Collectors.toList());
        int soma = numerosMaiorCinco.stream().reduce(0, (sub, n) -> sub + n);
        double media = soma / numerosMaiorCinco.size();
        System.out.println(media);
    }


public static void main(String[] args) throws Exception {
       
    D5 numeros = new D5();

    numeros.calcularMediaNumerosMaiorCinco();


}
}