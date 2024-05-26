
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
   
    public void ligar(String numero) {
        System.out.println("Ligando do Iphone para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo do Iphone.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz do Iphone.");
    }
    public void exibirPagina(String url) {
        System.out.println("Abrindo página do Iphone " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Add aba do Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página do Iphone.");
    }
    public void tocar() {
        System.out.println("Tocando música no Iphone.");
    }
    public void pausar() {
        System.out.println("Pausndo música no Iphone.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica + " no Iphone.");
    }
    
}

