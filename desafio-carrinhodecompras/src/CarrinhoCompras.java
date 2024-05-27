import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itensList;

    public CarrinhoCompras () {
        this.itensList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double valorReais, int quantidade) {
        Item item = new Item(nome, valorReais, quantidade);
        this.itensList.add(item);
        }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()){
            for (Item i : itensList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itensList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
          }
    }

        public double calcularValorTotal() {
            double valorTotal = 0d;
            if (!itensList.isEmpty()){
                for (Item item : itensList) {
                    double subtotalItem = item.getValor() * item.getQuantidade();
                    valorTotal += subtotalItem;
                }
                return valorTotal;            
            } else {
                throw new RuntimeException("A lista está vazia!");
            }

        
        }
    

        public void exibirItens() {
            if (!itensList.isEmpty()) {
                System.out.println(this.itensList);
            } else {
                System.out.println("A lista está vazia!");
            }
        }

        @Override
        public String toString() {
          return "CarrinhoCompras{" +
              "item=" + itensList +
              '}';

        }

}
  