package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    
    Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer maiorAparicoes = 0;
        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorAparicoes) {
                maiorAparicoes = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
          }
          return palavraMaisFrequente;

    }
}
