package ExercicioCatalogoLivro;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivro {

    //atributo
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
      livroList.add(new Livro(titulo, autor, ano));
      System.out.println("Livro " + titulo + " adicionado ao catálogo.");
    }

    public List<Livro> pesquisarPorAutor(String autor) {
      List<Livro> livroPorAutor = new ArrayList<>();
      if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getAutor().equalsIgnoreCase(autor)) {
            livroPorAutor.add(l);
          }
        }
      } else {
        System.out.println("O catálogo não contém nenhum título ainda :(");
      }
      return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
      List<Livro> livroPorIntervaloAno = new ArrayList<>();
      if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (anoInicial <= l.getAno() && l.getAno() <= anoFinal) {
            livroPorIntervaloAno.add(l);
          }
        }
      } else {
        System.out.println("O catálogo não contém nenhum título ainda :(");
      }
      return livroPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
      Livro livroPorTitulo = null;  
      if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getTitulo().equalsIgnoreCase(titulo)) {
            livroPorTitulo = l;
            break;
          }
        }
      return livroPorTitulo;
      } else {
        throw new RuntimeException("O catálogo não contém nenhum título ainda :(");
      }
      
    }

}

