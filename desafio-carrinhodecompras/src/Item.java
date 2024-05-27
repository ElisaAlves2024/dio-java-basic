public class Item {
 
    private String nome;
    private double valorReais;
    private int quantidade;

    public Item (String nome, double valorReais, int quantidade) {
        this.nome = nome;
        this.valorReais = valorReais;
        this.quantidade = quantidade;

    }

    public String getNome() {
            return nome;
    }
    public double getValor() {
            return valorReais;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
	public String toString() {
		return "Item{" +
				"nome = '" + nome + '\'' +
				", preço = " + valorReais +
				", quantidade = " + quantidade +
				'}';
    }
}
