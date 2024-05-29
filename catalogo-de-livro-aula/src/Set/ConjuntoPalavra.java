package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavra {
    
    private Set<String> palavraSet;

    public ConjuntoPalavra() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (! palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
            palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        if (! palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
                System.out.println("A palavra " + palavra + " foi encontrada no conjunto!");
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
        return palavraSet.contains(palavra);
    }

    public void exibirConjunto() {
            if (! palavraSet.isEmpty()) {
            System.out.println(palavraSet);
            } else {
            System.out.println("O conjunto está vazio!");
        }
    }



public static void main(String[] args) {

    ConjuntoPalavra conjuntoPalavra = new ConjuntoPalavra();

    conjuntoPalavra.adicionarPalavra("baveuse");
    conjuntoPalavra.adicionarPalavra("potager");
    conjuntoPalavra.adicionarPalavra("model");

    conjuntoPalavra.exibirConjunto();

    conjuntoPalavra.verificarPalavra("model");
    conjuntoPalavra.removerPalavra("baveuse");
    
    conjuntoPalavra.exibirConjunto();
}
}

