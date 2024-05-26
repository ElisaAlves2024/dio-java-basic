public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        AparelhoTelefonico celular = iphone;
        ReprodutorMusical ipod = iphone;
        NavegadorInternet safari = iphone;

        celular.ligar("555");
        ipod.selecionarMusica("Ops, I did it again!");
        safari.exibirPagina("www.google.com");


    }
}
