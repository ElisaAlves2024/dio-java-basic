package Map.Ordenação;

import java.util.*;

import Map.Ordenação.Livro.ComparatorPorPreco;

public class LivrariaOnline {
    
    Map<String, Livro> livrariaMap;

    public LivrariaOnline () {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrariaMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
    List<String> chavesRemover = new ArrayList<>();
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
        chavesRemover.add(entry.getKey());
      }
    }
    for (String chave : chavesRemover) {
      livrariaMap.remove(chave);
    }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livrosParaOrdenar, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

    for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
    }

    return livrosOrdenadosPorPreco;
  }

    public List<Livro> obterLivroMaisCaro() {
      List<Livro> livroMaisCaro = new ArrayList<>();
      double precoMaisAlto = Double.MIN_VALUE;

      if (!livrariaMap.isEmpty()) {
        for (Livro livro : livrariaMap.values()) {
          if (livro.getPreco() > precoMaisAlto) {
            precoMaisAlto = livro.getPreco();
          }
        }
      } else {
        throw new NoSuchElementException("A livraria está vazia!");
      }
      
      for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
        if (entry.getValue().getPreco() == precoMaisAlto) {
          Livro livroMaisCaroDeTodos = livrariaMap.get(entry.getKey());
          livroMaisCaro.add(livroMaisCaroDeTodos);
        }
      }
      return livroMaisCaro;
        
    }



    }

