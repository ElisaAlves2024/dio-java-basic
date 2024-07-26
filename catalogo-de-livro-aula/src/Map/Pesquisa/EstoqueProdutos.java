package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    
    Map<Long, Produtos> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double valor) {
        estoqueMap.put(cod, new Produtos(nome, quantidade, valor));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produtos p : estoqueMap.values()) {
            valorTotal += p.getQuant() * p.getValor();
        }
        return valorTotal;
    }

    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produtos p : estoqueMap.values()) {
            if(!estoqueMap.isEmpty()) {
                if(p.getValor() > maiorPreco) {
                produtoMaisCaro = p;
                }
            } else { 
                System.out.println("A lista está vazia!");
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato() {
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produtos p : estoqueMap.values()) {
            if(!estoqueMap.isEmpty()) {
                if(p.getValor() < menorPreco) {
                produtoMaisBarato = p;
                }
            } else { 
                System.out.println("A lista está vazia!");
            }
        }
        return produtoMaisBarato;
    }


    public Produtos obterProdutoMaiorQuantidade() {
        Produtos produtoMaiorQuantidade = null;
        int maiorQuantidade = Integer.MIN_VALUE;
        for (Produtos p : estoqueMap.values()) {
            if(!estoqueMap.isEmpty()) {
                if((p.getQuant()*p.getValor()) > maiorQuantidade) {
                produtoMaiorQuantidade = p;
                }
            } else { 
                System.out.println("A lista está vazia!");
            }
        }
        return produtoMaiorQuantidade;
    }
}
