package Map.Pesquisa;

public class Produtos {
    
    private String nome;
    private int quantidade;
    private Double valor;

    public Produtos(String nome, int quantidade, Double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuant() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }

}
