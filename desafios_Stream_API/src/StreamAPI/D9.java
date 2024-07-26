package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class D9 {

    private List<Integer> numerosList;
    
    public D9() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      //não solicitado pelo exercício, mas fiz
    public void retirarNumerosRepetidos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> semValoresRepetidos = numerosList.stream().distinct().collect(Collectors.toList());
        System.out.println(semValoresRepetidos);
    }

    // não consegui fazer
    public void verificarNumerosRepetidos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> semValoresRepetidos = numerosList.stream().distinct().collect(Collectors.toList());
        System.out.println(semValoresRepetidos);
    }


public static void main(String[] args) throws Exception {
       
    D9 numeros = new D9();

    numeros.verificarNumerosRepetidos();


}
}
