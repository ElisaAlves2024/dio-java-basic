package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    public Set<Tarefa> tarefaSet;

    public ListaTarefas () {
        this.tarefaSet = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirTarefas() {
        if (! tarefaSet.isEmpty()) {
        System.out.println(tarefaSet);
        } else {
        System.out.println("A lista está vazia!");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        if (! tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == true) {
                    tarefaConcluida.add(t);
                }
            }
        } else {
        System.out.println("A lista está vazia!");
        }
        return tarefaConcluida;
    }
    
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendente = new HashSet<>();
        if (! tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida() == false) {
                    tarefaPendente.add(t);
                }
            }
        } else {
        System.out.println("A lista está vazia!");
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (! tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                } 
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (! tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                } 
            }
        }
    }

    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefaSet.clear();
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    /*
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        System.out.println(listaTarefas.obterTarefasPendentes());
    */
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
