package List.Ordenação.Pessoas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura) {
       pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade, );
        return pessoaPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura);
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();

        ordenarPessoas.adicionarPessoa("Elisa", 1, 1.2d);
        ordenarPessoas.adicionarPessoa("Thiago", 5, 1.5d);
        ordenarPessoas.adicionarPessoa("Judas", 7, 1.8d);
        ordenarPessoas.adicionarPessoa("Madalena", 3, 1.6d);

        System.out.println(ordenarPessoas.ordenarIdade());
        System.out.println(ordenarPessoas.ordenarPorAltura());
    }

}
