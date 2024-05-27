public class Usuario {
    public static void main(String[] args) throws Exception {
        
        CarrinhoCompras armarinho = new CarrinhoCompras();

        // imprimindo itens do carrinho.
        armarinho.exibirItens();

        // adicionando itens no carrinho.
        armarinho.adicionarItem("agulha de tricot - 4mm", 5.46d, 2);
        armarinho.adicionarItem("lã penguim azul-marinho - acrílico", 7.34d, 5);
        armarinho.adicionarItem("tesoura", 14.99d, 1);
        
        // imprimindo itens do carrinho para identificar se itens foram adicionados adequadamente.
        armarinho.exibirItens();

        // Calcular valor do carrinho.
        armarinho.calcularValorTotal();

        //Imprimir valor do carrinho
        System.out.println("O valor total da compra é = " + armarinho.calcularValorTotal());

        armarinho.removerItem("tesoura");

        

    }
}
