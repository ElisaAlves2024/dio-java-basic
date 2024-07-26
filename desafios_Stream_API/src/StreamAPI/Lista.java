import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lista {

    private List<Integer> numerosList;
    
    public Lista() {
        this.numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    public void ordemNumerica() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        numerosList.stream()
        .sorted()
        .forEach(System.out::println);
    }
    
    public void somaNumerosPares() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        List<Integer> numerosPares = numerosList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        int soma = numerosPares.stream().reduce(0, (sub, n) -> sub + n);
        System.out.println(soma);       
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

    public void todosOsNumerosPositivos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        boolean todosNumerosSaoPositivos = numerosList.stream().allMatch(n -> n > 0);
        System.out.println("Todos os números da lista são positivos: " + todosNumerosSaoPositivos);
    }

    public void removerNumerosImpares() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        List<Integer> numerosPares = numerosList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(numerosPares);       
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

    public void verificarExistenciaValor() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        int chaveDePesquisa = 10;
        boolean existeValor = numerosList.stream().anyMatch(n -> n == chaveDePesquisa);
        System.out.println("A lista contem o valor " + chaveDePesquisa + ": " + existeValor);
    }

    public void encontrarSegundoMaior() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> numerosEmOrdem = numerosList.stream().sorted().collect(Collectors.toList());
        Optional<Integer> segundoMaiorNumero = numerosEmOrdem.stream().skip((numerosEmOrdem.size())-2).findFirst();
        System.out.println(segundoMaiorNumero);
    }

    /*public void somarDigitos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        Integer somaDigitos = numerosList.stream().map(n -> String.valueOf(n)).forEach(String -> String.toCharArray());;
        
    }*/


    public void retirarNumerosRepetidos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> semValoresRepetidos = numerosList.stream().distinct().collect(Collectors.toList());
        System.out.println(semValoresRepetidos);
    }

    /*public void verificarNumerosRepetidos() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Integer> semValoresRepetidos = numerosList.stream().distinct().collect(Collectors.toList());
        System.out.println(semValoresRepetidos);
    }*/

    public void agruparNumerosPorCondição() {
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
          }
        
        List<Integer> numerosCondicao = numerosList.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).collect(Collectors.toList());
        System.out.println(numerosCondicao);  
             
    }

}

