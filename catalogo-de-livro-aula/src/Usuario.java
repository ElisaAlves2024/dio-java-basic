public class Usuario {
    public static void main(String[] args) throws Exception {
        
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        
        catalogoLivro.adicionarLivro("Desventuras em série1", "Snicket", 2004);
        catalogoLivro.adicionarLivro("Desventuras em série2", "Snicket", 2005);
        catalogoLivro.adicionarLivro("Desventuras em série3", "Snicket", 2010);
        catalogoLivro.adicionarLivro("Arsene Lupin", "Jean-Pierre", 1990);
       
        catalogoLivro.pesquisaPorAutor("Snicket");
        catalogoLivro.pesquisarPorIntervaloAnos(2000,2010);

    }
}
