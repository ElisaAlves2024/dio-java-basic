package Map;

import java.util.HashMap;
import java.util.Map;


public class Dicionario {
    
    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }
    
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        definicaoPorPalavra = dicionarioMap.get(palavra);
        return definicaoPorPalavra;
    }


}
