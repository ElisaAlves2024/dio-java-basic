
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

    public void pesquisaPorAutor(String autor) {
      List<Livro> livroAutorPesq = new ArrayList<>();
      if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getAutor().equalsIgnoreCase(autor)) {
            livroAutorPesq.add(l);
          }
        }
        System.out.println(livroAutorPesq);
      } else {
        System.out.println("A lista está vazia!");
      }
      
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
      List<Livro> livroIntervAnoPesq = new ArrayList<>();
      if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (anoInicial <= l.getAno() && l.getAno() <= anoFinal) {
            livroIntervAnoPesq.add(l);
          }
        }
        System.out.println(livroIntervAnoPesq);
      } else {
        System.out.println("A lista está vazia!");
      }
      
    }

    public void pesquisaPorTitulo(String titulo) {
        if (! livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println(l);
            break;
          }
        }
        
      } else {
        System.out.println("A lista está vazia!");
      }
      
    }

}

