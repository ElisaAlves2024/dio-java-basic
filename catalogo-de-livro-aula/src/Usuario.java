public class Usuario {
    public static void main(String[] args) throws Exception {
        
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        
        catalogoLivro.adicionarLivro("Desventuras em série1", "Snicket", 2004);
        catalogoLivro.adicionarLivro("Desventuras em série2", "Snicket", 2005);
        catalogoLivro.adicionarLivro("Desventuras em série3", "Snicket", 2017);
        catalogoLivro.adicionarLivro("Desventuras em série3", "Snicke, Lemony", 2015);
        catalogoLivro.adicionarLivro("Arsene Lupin", "Jean-Pierre", 1990);
       
        System.out.println(catalogoLivro.pesquisarPorAutor("Snicket"));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2000,2010));
        System.out.println(catalogoLivro.pesquisaPorTitulo("Desventuras em série3"));

    }
}
