package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class D6 {

    private List<Integer> numerosList;
    
    public D6() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

      
    public void verificarExistenciaValor() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        int chaveDePesquisa = 10;
        boolean existeValor = numerosList.stream().anyMatch(n -> n == chaveDePesquisa);
        System.out.println("A lista contem o valor " + chaveDePesquisa + ": " + existeValor);
    }



public static void main(String[] args) throws Exception {
       
    D6 numeros = new D6();

    numeros.verificarExistenciaValor();


}
}
